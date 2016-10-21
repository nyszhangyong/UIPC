package com.swing.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import com.base.BaseInfo;


public class MainFrame  extends JFrame {
	private static final long serialVersionUID = 1L;
	private JSplitPane mainJSplitPane;
	public static TabbedPane tabbedPane;
    public MainFrame() {
        //初始化窗口内组件
        initComponent();
    	//获取显示器屏幕的分辨率例如：1366*768，也就是显示器屏幕的宽、高（包含任务栏的高度）
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	//获取windows桌面距离显示器上下左右四个边的距离
    	//请注意，桌面的概念指的是可以放置快捷方式图表的桌面
    	//桌面是不包含任务栏的，任务栏只是桌面下方的一个工具条
    	//因此此处返回的值：一般距离上下左右的距离是0、40、0、0
        Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());  
        //设置窗口标题
        this.setTitle("管理信息系统");
        //设置窗口的宽、高，分别等于屏幕的宽、高等于屏幕高度减去任务栏高度，长度单位是像素
        //this.setSize(screenSize.width,screenSize.height-screenInsets.bottom);  
        //设置字体
        this.setFont(new Font("Helvetica", Font.PLAIN, 14));  
        //设置窗口关闭按钮，单击时执行的操作(关闭、隐藏等)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口相对于父类JFrame的相对位置
        //距离JFrame左边、上边距离、自己的宽和显示器相等，高等于屏幕高度减去任务栏高度
        this.setBounds(0, 0,screenSize.width,screenSize.height-screenInsets.bottom);
        //设置窗口的标题图标
        URL prodlogoUrl=LoginFrame.class.getClassLoader().getResource(BaseInfo.imagesPath+"prodlogo.gif");
        this.setIconImage(new ImageIcon(prodlogoUrl).getImage());
        //设置窗口是否可以调整大小，参数为布尔值
        this.setResizable(true);
        //设置窗口是否可见（此语句必须有，否则看不到界面，失去了创建界面的意义）
        this.setVisible(true);

    }

    public void initComponent() {
    	
    	//创建一个左右分割面板
        mainJSplitPane = new JSplitPane();
        //设置分割线宽度
        mainJSplitPane.setDividerSize(2);
        //设置mainJSplitPane的分隔线位置
        mainJSplitPane.setDividerLocation(200);
        //设置背景色
        mainJSplitPane.setBackground(Color.LIGHT_GRAY);
        //拖曳分隔线时，窗口内的组件是否会动态改变大小
        mainJSplitPane.setContinuousLayout(true);
        //设置mainJSplitPane大小，自动设置大小
        mainJSplitPane.setPreferredSize(getPreferredSize());
        //设置分割线为水平分割线
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
    	
        //设置布局管理器
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
