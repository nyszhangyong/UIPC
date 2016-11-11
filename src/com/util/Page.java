package com.util;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.Order.Direction;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page {

	//要查询的页码
    private int pageNumber = 1;
    //要查询的页大小
    private int pageSize = 20;
    //总记录数
    private int totalRecord=0;
    
    private String sortString;
    private String orderString;

    public String getOrderString() {
        return orderString;
    }

    public void setOrderString(String orderString) {
        this.orderString = orderString;
    }

    private Map<String,String> orderExprs = new HashMap<String, String>();

    public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public String getSortString() {
        /**
         * 由于easyUI前台传递的字段名称为Entity类中的属性名称，而不是数据库字段名
         * shopName，其实对应的字段为shop_name才正确，这里处理下，使排序功能正常
         */
        if(StringUtils.isNotEmpty(sortString))
        {
            StringBuffer sb=new StringBuffer(sortString);
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
        return sortString;
    }

    public void setSortString(String sortString) {
        this.sortString = sortString;
    }

    public void addOrderExpr(String property, String expr){
        this.orderExprs.put(property,expr);
    }

    public PageBounds toPageBounds(){
        List<Order> ordersList=new ArrayList<Order>();
        if(sortString!=null&&sortString.indexOf(",")<0){
        	//单个列排序的逻辑封装
        	Direction direction=Order.Direction.fromString(getOrderString());
        	Order element=new Order(getSortString(),direction ,null);
        	ordersList.add(0,element);
            return new PageBounds(pageNumber, pageSize, ordersList);
        }else{
        	//多列复合排序的封装name.desc,type.asc 这样的需求
        	ordersList = Order.formString(getSortString());
            for (int i = 0; i < ordersList.size(); i++) {
                Order order =  ordersList.get(i);
                if(orderExprs.get(order.getProperty()) != null){
                	ordersList.set(i, new Order(
                            order.getProperty(),
                            order.getDirection(),
                            orderExprs.get(order.getProperty()))
                    );
                }
            }
        }
        return new PageBounds(pageNumber, pageSize, ordersList);
    }
}
