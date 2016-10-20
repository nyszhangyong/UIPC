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
        
        //��ҳ��ť
        firstPageButton = new JButton("��ҳ");
        firstPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	firstPageActionListener(e);
            }
        });
        pagingButtonJPanel.add(firstPageButton);
        
        //��һҳ��ť
        latePageButton = new JButton("��һҳ");
        latePageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	latePageActionListener(e);
            }
        });
        pagingButtonJPanel.add(latePageButton);
        
        //��һҳ��ť
        nextPageButton = new JButton("��һҳ");
        nextPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextPageActionListener(e);
            }
        });
        pagingButtonJPanel.add(nextPageButton);
        
        //ĩҳ��ť
        lastPageButton = new JButton("ĩҳ");
        lastPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	lastPageActionListener(e);
            }
        });
        pagingButtonJPanel.add(lastPageButton);
        
        //���������ı��
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);
        add(scrollPane, BorderLayout.CENTER);
        
    	//���������
        defaultTableModel = (DefaultTableModel) table.getModel();
        defaultTableModel.setColumnIdentifiers(new Object[] { "����", "�Ա�", "����", "����", "ѧ��", "��Ƭ" });
        for (int i = 0; i < 23; i++) {
            defaultTableModel.addRow(new Object[] { "����", "��", "22", "1992��01��20��", "��ѧ����", "��" });
        }
        maxPageNumber = (int) Math.ceil(defaultTableModel.getRowCount() / pageSize);
        table.setModel(defaultTableModel);
        
        //�����ĸ���ťĬ���Ƿ���Ե����״̬
        firstPageButton.setEnabled(false);
        latePageButton.setEnabled(false);
        nextPageButton.setEnabled(true);
        lastPageButton.setEnabled(true);
    }
    


    //��ҳ�¼�
    protected void firstPageActionListener(ActionEvent e) {
    	//��ʼҳ
        currentPageNumber = 1;
        //�õ�����
        Vector<?> dataVector = defaultTableModel.getDataVector();
        //ģ��
        DefaultTableModel newModel = new DefaultTableModel();
        
        newModel.setColumnIdentifiers(new Object[] { "���", "�����" });
        for (int i = 0; i < pageSize; i++) {
            newModel.addRow((Vector<?>) dataVector.elementAt(i));
        }
        table.setModel(newModel);
        firstPageButton.setEnabled(false);
        latePageButton.setEnabled(false);
        nextPageButton.setEnabled(true);
        lastPageButton.setEnabled(true);
    }

    //��һҳ�¼�
    protected void latePageActionListener(ActionEvent e) {
        currentPageNumber--;
        Vector<?> dataVector = defaultTableModel.getDataVector();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.setColumnIdentifiers(new Object[] { "���", "�����" });
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

    //��һҳ
    protected void nextPageActionListener(ActionEvent e) {
        currentPageNumber++;
        Vector<?> dataVector = defaultTableModel.getDataVector();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.setColumnIdentifiers(new Object[] { "���", "ƽ����" });
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
    
    //ĩҳ
    protected void lastPageActionListener(ActionEvent e) {
        currentPageNumber = maxPageNumber;
        Vector<?> dataVector = defaultTableModel.getDataVector();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.setColumnIdentifiers(new Object[] { "���", "ƽ����" });
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