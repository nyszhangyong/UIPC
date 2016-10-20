package com.swing.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MainFrame  extends JFrame {
	private static final long serialVersionUID = 1L;
	private JSplitPane mainJSplitPane;
	public static TabbedPane tabbedPane;
    public MainFrame() {
        //��ʼ�����������
        initComponent();
    	//��ȡ��ʾ����Ļ�ķֱ������磺1366*768��Ҳ������ʾ����Ļ�Ŀ��ߣ������������ĸ߶ȣ�
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	//��ȡwindows���������ʾ�����������ĸ��ߵľ���
    	//��ע�⣬����ĸ���ָ���ǿ��Է��ÿ�ݷ�ʽͼ�������
    	//�����ǲ������������ģ�������ֻ�������·���һ��������
    	//��˴˴����ص�ֵ��һ������������ҵľ�����0��40��0��0
        Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());  
        //���ô��ڱ���
        this.setTitle("������Ϣϵͳ");
        //���ô��ڵĿ��ߣ��ֱ������Ļ�Ŀ��ߵ�����Ļ�߶ȼ�ȥ�������߶ȣ����ȵ�λ������
        //this.setSize(screenSize.width,screenSize.height-screenInsets.bottom);  
        //��������
        this.setFont(new Font("Helvetica", Font.PLAIN, 14));  
        //���ô��ڹرհ�ť������ʱִ�еĲ���(�رա����ص�)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���ô�������ڸ���JFrame�����λ��
        //����JFrame��ߡ��ϱ߾��롢�Լ��Ŀ����ʾ����ȣ��ߵ�����Ļ�߶ȼ�ȥ�������߶�
        this.setBounds(0, 0,screenSize.width,screenSize.height-screenInsets.bottom);
        //���ô��ڵı���ͼ��
        this.setIconImage(new ImageIcon("./src/com/ea/login/view/images/prodlogo.gif").getImage());
        //���ô����Ƿ���Ե�����С������Ϊ����ֵ
        this.setResizable(true);
        //���ô����Ƿ�ɼ������������У����򿴲������棬ʧȥ�˴�����������壩
        this.setVisible(true);

    }

    public void initComponent() {
    	
    	//����һ�����ҷָ����
        mainJSplitPane = new JSplitPane();
        //���÷ָ��߿��
        mainJSplitPane.setDividerSize(2);
        //����mainJSplitPane�ķָ���λ��
        mainJSplitPane.setDividerLocation(200);
        //���ñ���ɫ
        mainJSplitPane.setBackground(Color.LIGHT_GRAY);
        //��ҷ�ָ���ʱ�������ڵ�����Ƿ�ᶯ̬�ı��С
        mainJSplitPane.setContinuousLayout(true);
        //����mainJSplitPane��С���Զ����ô�С
        mainJSplitPane.setPreferredSize(getPreferredSize());
        //���÷ָ���Ϊˮƽ�ָ���
        mainJSplitPane.setOrientation (JSplitPane.HORIZONTAL_SPLIT); 
        LeftNavigationJPanel leftNavigationJPanel=new LeftNavigationJPanel();
        mainJSplitPane.setLeftComponent(leftNavigationJPanel.startCreateLeftNavigationJPanel());

        tabbedPane = new TabbedPane();
		tabbedPane.setCloseButtonEnabled(true);
    	mainJSplitPane.setRightComponent(tabbedPane);
    	
    	JPanel northJPanel=new JPanel();
    	northJPanel.setBackground(Color.LIGHT_GRAY);

    	JPanel southJPanel=new JPanel();
    	southJPanel.setBackground(Color.LIGHT_GRAY);
    	
        //���ò��ֹ�����
        BorderLayout borderLayout=new BorderLayout(2,2);
        Container container=getContentPane();
    	container.setLayout(borderLayout);
    	container.setPreferredSize(getPreferredSize());
    	container.add(northJPanel, "North");
    	container.add(mainJSplitPane, "Center");
    	container.add(southJPanel, "South");
    }
    
    public static void main(String args[]) {
        new MainFrame();
    }
}
