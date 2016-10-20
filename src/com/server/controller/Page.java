package com.server.controller;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page {

    private int page = 1;
    private int rows = 20;
    private String sort;
    private String order;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    private Map<String,String> orderExprs = new HashMap<String, String>();

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getSort() {
        /**
         * 由于easyUI前台传递的字段名称为Entity类中的属性名称，而不是数据库字段名
         * shopName，其实对应的字段为shop_name才正确，这里处理下，使排序功能正常
         */
        if(StringUtils.isNotEmpty(sort))
        {
            StringBuffer sb=new StringBuffer(sort);
            for(int i=0;i< sb.length();i++)
            {
                char c= 0;
                try {
                    c = sb.charAt(i);
                    if (c >= 'A' && c <= 'Z')
                    {
                        sb.insert(i,"_");
                        i=i+2;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return sb.toString().toLowerCase();
        }
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void addOrderExpr(String property, String expr){
        this.orderExprs.put(property,expr);
    }

    public PageBounds toPageBounds(){
        List<Order> orders=new ArrayList<Order>();
        if(sort!=null&&sort.indexOf(",")<0)
        {//单个列排序的逻辑封装
            orders.add(0,new Order(getSort(), Order.Direction.fromString(getOrder()),null));
            return new PageBounds(page, rows, orders);
        }else
        {//多列复合排序的封装name.desc,type.asc 这样的需求
            orders = Order.formString(getSort());
            for (int i = 0; i < orders.size(); i++) {
                Order order =  orders.get(i);
                if(orderExprs.get(order.getProperty()) != null){
                    orders.set(i, new Order(
                            order.getProperty(),
                            order.getDirection(),
                            orderExprs.get(order.getProperty()))
                    );
                }
            }
        }
        return new PageBounds(page, rows, orders);
    }
}
