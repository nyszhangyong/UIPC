package com.swing.login;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PageTable extends JPanel {
    
	private static final long serialVersionUID = 1L;
    private JTable table;
    private JButton firstPageButton;
    private JButton latePageButton;
    private JButton nextPageButton;
    private JButton lastPageButton;
    private int maxPageNumber;
    private int currentPageNumber = 1;
    private double pageSize = 5;
    private DefaultTableModel defaultTableModel;
    
    public PageTable() {
    	
        setLayout(new BorderLayout(0, 0));
        
        JPanel pagingButtonJPanel = new JPanel();
        add(pagingButtonJPanel, BorderLayout.NORTH);
        
        //首页按钮
        firstPageButton = new JButton("首页");
        firstPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	firstPageActionListener(e);
            }
        });
        pagingButtonJPanel.add(firstPageButton);
        
        //上一页按钮
        latePageButton = new JButton("上一页");
        latePageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	latePageActionListener(e);
            }
        });
        pagingButtonJPanel.add(latePageButton);
        
        //下一页按钮
        nextPageButton = new JButton("下一页");
        nextPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextPageActionListener(e);
            }
        });
        pagingButtonJPanel.add(nextPageButton);
        
        //末页按钮
        lastPageButton = new JButton("末页");
        lastPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	lastPageActionListener(e);
            }
        });
        pagingButtonJPanel.add(lastPageButton);
        
        //带滚动条的表格
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);
        add(scrollPane, BorderLayout.CENTER);
        
    	//填充表格内容
        defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.setColumnIdentifiers(new Object[] { "姓名", "性别", "年龄", "生日", "学历", "照片" });
        for (int i = 0; i < 23; i++) {
            defaultTableModel.addRow(new Object[] { "张三", "男", "22", "1992年01月20日", "大学本科", "无" });
        }
        maxPageNumber = (int) Math.ceil(defaultTableModel.getRowCount() / pageSize);
        table.setModel(defaultTableModel);
        
        //设置四个按钮默认是否可以点击的状态
        firstPageButton.setEnabled(false);
        latePageButton.setEnabled(false);
        nextPageButton.setEnabled(true);
        lastPageButton.setEnabled(true);
    }
    


    //首页事件
    protected void firstPageActionListener(ActionEvent e) {
    	//初始页
        currentPageNumber = 1;
        //得到集合
        Vector<?> dataVector = defaultTableModel.getDataVector();
        //模型
        DefaultTableModel newModel = new DefaultTableModel();
        
        newModel.setColumnIdentifiers(new Object[] { "序号", "随机数" });
        for (int i = 0; i < pageSize; i++) {
            newModel.addRow((Vector<?>) dataVector.elementAt(i));
        }
        table.setModel(newModel);
        firstPageButton.setEnabled(false);
        latePageButton.setEnabled(false);
        nextPageButton.setEnabled(true);
        lastPageButton.setEnabled(true);
    }

    //上一页事件
    protected void latePageActionListener(ActionEvent e) {
        currentPageNumber--;
        Vector<?> dataVector = defaultTableModel.getDataVector();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.setColumnIdentifiers(new Object[] { "序号", "随机数" });
        for (int i = 0; i < pageSize; i++) {
            newModel.addRow((Vector<?>) dataVector.elementAt((int) (pageSize * (currentPageNumber - 1) + i)));
        }
        table.setModel(newModel);
        if (currentPageNumber == 1) {
            firstPageButton.setEnabled(false);
            latePageButton.setEnabled(false);
        }
        nextPageButton.setEnabled(true);
        lastPageButton.setEnabled(true);
    }

    //下一页
    protected void nextPageActionListener(ActionEvent e) {
        currentPageNumber++;
        Vector<?> dataVector = defaultTableModel.getDataVector();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.setColumnIdentifiers(new Object[] { "序号", "平方数" });
        if (currentPageNumber == maxPageNumber) {
            int lastPageSize = (int) (defaultTableModel.getRowCount() - pageSize * (maxPageNumber - 1));
            for (int i = 0; i < lastPageSize; i++) {
                newModel.addRow((Vector<?>) dataVector.elementAt((int) (pageSize * (maxPageNumber - 1) + i)));
            }
            nextPageButton.setEnabled(false);
            lastPageButton.setEnabled(false);
        } else {
            for (int i = 0; i < pageSize; i++) {
                newModel.addRow((Vector<?>) dataVector.elementAt((int) (pageSize * (currentPageNumber - 1) + i)));
            }
        }
        table.setModel(newModel);
        firstPageButton.setEnabled(true);
        latePageButton.setEnabled(true);
    }
    
    //末页
    protected void lastPageActionListener(ActionEvent e) {
        currentPageNumber = maxPageNumber;
        Vector<?> dataVector = defaultTableModel.getDataVector();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.setColumnIdentifiers(new Object[] { "序号", "平方数" });
        int lastPageSize = (int) (defaultTableModel.getRowCount() - pageSize * (maxPageNumber - 1));
        
        if (lastPageSize == 5) {
            for (int i = 0; i < pageSize; i++) {
                newModel.addRow((Vector<?>) dataVector.elementAt((int) (pageSize * (maxPageNumber - 1) + i)));
            }
        } else {
            for (int i = 0; i < lastPageSize; i++) {
                newModel.addRow((Vector<?>) dataVector.elementAt((int) (pageSize * (maxPageNumber - 1) + i)));
            }
        }
        
        table.setModel(newModel);
        firstPageButton.setEnabled(true);
        latePageButton.setEnabled(true);
        nextPageButton.setEnabled(false);
        lastPageButton.setEnabled(false);
        
    }
}