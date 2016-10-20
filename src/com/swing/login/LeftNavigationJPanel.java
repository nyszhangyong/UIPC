package com.swing.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

public class LeftNavigationJPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//导航栏北部面板
	private JPanel navigationJPanel_North;
	
	//导航栏中部面板-滚动条容器
	private JScrollPane navigationJScrollPane_Center;
	
	//导航栏南部面板-普通容器
	private MenuItemJPanel menuItemJPanel_Center;
	
	//导航栏南部面板
	private JPanel navigationJPanel_South;
	
    //激活的碰碰条按钮
    private JButton activeTouchBarJButton;
        
    //放置所有碰碰条按钮的List
    private ArrayList<JButton> allTouchBarJButtonArrayList;
    
	//放置所有碰碰条按钮状态的数组（展开、收缩）
    private int[] touchBarJButtonStatusIntArray;
    
    //碰碰条菜单项树
    private JTree[] touchBarJTreeArray;
	
    //构造方法
	public LeftNavigationJPanel() {
		
		this.setLayout(new BorderLayout());
		
		allTouchBarJButtonArrayList = new ArrayList<JButton>();
		
		//导航栏北部面板
		navigationJPanel_North=new JPanel();
		navigationJPanel_North.setLayout(new MenuItemsLayout());
		//navigationJPanel_North.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        this.add(navigationJPanel_North, BorderLayout.NORTH);
        
        //导航栏中部面板
		navigationJScrollPane_Center=new JScrollPane();
		menuItemJPanel_Center=new MenuItemJPanel();		
		menuItemJPanel_Center.setLayout(new MenuItemsLayout());
		//menuItemJPanel_Center.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
		navigationJScrollPane_Center = new JScrollPane(menuItemJPanel_Center);
        this.add(navigationJScrollPane_Center, BorderLayout.CENTER);
        
        //导航栏南部面板
		navigationJPanel_South=new JPanel();		
		navigationJPanel_South.setLayout(new MenuItemsLayout());
		//navigationJPanel_South.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
        this.add(navigationJPanel_South, BorderLayout.SOUTH);
	}
    
    //开始创建导航目录树
    public LeftNavigationJPanel startCreateLeftNavigationJPanel() {
    	LeftNavigationJPanel leftNavigationJPanel=new LeftNavigationJPanel();
    	//设置碰碰条数目为2个
    	int touchBarCount=2;
        //实例化碰碰条展开、收缩状态数组
    	leftNavigationJPanel.setTouchBarJButtonStatusIntArray(touchBarCount);
    	//实例化碰碰条菜单项数组
    	leftNavigationJPanel.setTouchBarJTreeArray(touchBarCount);
    	
        for (int i = 0; i < touchBarCount; i++) {
        	//为每一个碰碰条按钮：命名
        	leftNavigationJPanel.addTouchBarJButton(i,"TouchBarJButton" + i);
        	//为每一个碰碰条按钮：填充菜单项树
        	leftNavigationJPanel.setTouchBarJButtonJTree(i,leftNavigationJPanel.getTree());
        	//为每一个碰碰条按钮：赋予默认收缩状态（0代表收缩）
        	leftNavigationJPanel.setTouchBarJButtonStatus(i,0);
        }
        
        //展开指定碰碰条按钮(默认展开第一个菜单项)
        leftNavigationJPanel.expandTouchBarJPanel(leftNavigationJPanel.allTouchBarJButtonArrayList.get(0));
        return leftNavigationJPanel;
    }
    
    /**设置：实例化碰碰条展开、收缩状态数组*/
	public void setTouchBarJButtonStatusIntArray(int touchBarJButtonStatusIntArray) {
		this.touchBarJButtonStatusIntArray = new int[touchBarJButtonStatusIntArray];
	}

    /**设置：指定碰碰条的状态,0=收缩 1=展开*/
	public void setTouchBarJButtonStatus(int i,int status) {
		this.touchBarJButtonStatusIntArray[i] = status;
	}
	
    /**设置：实例化碰碰条菜单项数组*/
	public void setTouchBarJTreeArray(int touchBarJTreeArray) {
		this.touchBarJTreeArray = new JTree[touchBarJTreeArray];
	}
	
    /**设置：指定碰碰条菜单项树*/
	public void setTouchBarJButtonJTree(int i,JTree jTree) {
		this.touchBarJTreeArray[i] = jTree;
	}

    /**增加：新增一个碰碰条（指定索引、名称） */
    public void addTouchBarJButton(int index, String name) {
    	addTouchBarJButton(index, name, UIManager.getColor("Desktop.background"));
    }
    
    /**增加：新增一个碰碰条（指定索引、名称、背景色） */
    public void addTouchBarJButton(int index, String name, Color backgroundColor) {
        JButton touchBarJButton= addTouchBarJButton(navigationJPanel_North, index, name, backgroundColor);
        touchBarJButton.addActionListener(jButtonActionListener);
        this.allTouchBarJButtonArrayList.add(index, touchBarJButton);
    }
    
    /**增加：新增一个碰碰条按钮（指定索引、名称、背景色） */
    private JButton addTouchBarJButton(JPanel jPanel, int index, String name,Color bg) {
    	JButton touchBarJButton = new JButton(name);
        jPanel.add(touchBarJButton);
        return touchBarJButton;
    }
    
    
    /**增加：往指定碰碰条中插入指定菜单项（指定碰碰条的索引号，菜单项的索引号自动计算当前碰碰条中的菜单项数量加1）*/
    public void addMenuItemToMenuItemJPanelCenter(Component menuItem) {
    	menuItemJPanel_Center.add(menuItem);
    }
    
    /**查询：得到所有碰碰条按钮数量*/
    public int getAllTouchBarJButtonCount() {
        return allTouchBarJButtonArrayList.size();
    }
    
    /**监听：监听按钮点击事件*/
    transient ActionListener jButtonActionListener = new ActionListener() {
        //transient关键字只能修饰变量,而不能修饰方法和类,被transient关键字修饰的变量不再能被序列化
        public void actionPerformed(ActionEvent actionEvent) {
            JButton currentClickTouchBarJButton = (JButton) actionEvent.getSource();
            expandTouchBarJPanel(currentClickTouchBarJButton);
        }
    };
    
    /**展开：展开指定碰碰条 */
    protected void expandTouchBarJPanel(JButton currentClickTouchBarJButton) {
        //JOptionPane.showMessageDialog(null,currentClickTouchBarJButton.getText(), "提示消息",JOptionPane.WARNING_MESSAGE); 
    	//指定碰碰条位于所有碰碰条ArrayList中的第几个
        int num = 0;
        //清空北、中、南三部分的面板容器内容
        navigationJPanel_North.removeAll();
        menuItemJPanel_Center.removeAll();
        navigationJPanel_South.removeAll();
    	
        //是否找到了要展开的合并碰碰条？默认没有找到
        boolean hasAddCenter = false;
        //遍历所有的碰碰条
        for (int i = 0; i < allTouchBarJButtonArrayList.size(); i++) {
            Component component = (Component) allTouchBarJButtonArrayList.get(i);
            //遍历到合并碰碰条的时候，证明该碰碰条不是在北边就是在南边容器
            //因为只有北部、南部面板是专门存储合并碰碰条的
            //中间容器是专门存储展开面板的
            //此处的if、else语句判断处理的目的只有一个：
            //那就是确定所有碰碰条按钮接下来是要放到北部、还是南部，还有他们的状态是打开？
            //还是收缩，此处的判断并不会决定中间容器放的内容
            if (touchBarJButtonStatusIntArray[i] == 0) {
                if (hasAddCenter) {
                	//第一次循环，本判断不会执行（因为默认是false），第一次会直接执行下个判断
                	//第二次循环开始执行，如果本次之前已经找到了要展开的合并碰碰条，并且已经放到了中间容器
                	//那么剩下的合并碰碰条，全部移动到南部面板
                	navigationJPanel_South.add(component);
                } else if (component == currentClickTouchBarJButton) {
                	//如果点击的碰碰条按钮是合并状态的，那么无论它此时是在南部、还是北部，
                	//接下来，一定会把它到北部容器，因为它的内容要在中间显示，所以标题按钮必须放在北部容器
                	navigationJPanel_North.add(component);
                    //然后把当前点击的碰碰条状态置为1，就是已经打开
                    touchBarJButtonStatusIntArray[i] = 1;
                    //记录下当前点击的碰碰条位于所有碰碰条ArrayList中的第几个
                    num = i + 1;
                    //标记当前碰碰条的内容已经独占了中间容器，不允许其他按钮再占有中间容器
                    hasAddCenter = true;
                } else {
                	//如果遍历到的当前碰碰条，不是要展开的碰碰条，则把它放到北部面板
                	navigationJPanel_North.add(component);
                }
            } else {//遍历到展开碰碰条的时候，证明到了中间容器
            	
            	//如果当前中间容器中的碰碰条，不等于null，就关闭，然后置为null对象
                if (activeTouchBarJButton != null) {
                	//无论当前点击的是否是正在展开的按钮，
                	//当前正在展开的按钮，都要关闭，点击它是要关闭它，
                	//点击其它按钮也是要关闭它，因此此处只有关闭一个动作
                	//menuItemJPanel_Center.removeAll();
                	activeTouchBarJButton = null;
                }
                
                //如果遍历到的展开碰碰条，正是当前点击的碰碰条按钮
                if (component == currentClickTouchBarJButton) {
                	navigationJPanel_North.add(component);
                } else if (num == 0) {
                	//如果点击的是南部的碰碰条，那么当遍历到展开的碰碰条时候，num一定等于0，因此放到北部面板
                	navigationJPanel_North.add(component);
                }else {//证明当前点击的是北部的碰碰条，因此把展开的碰碰条放到南部
                	navigationJPanel_South.add(component);
                }
                //把指定的碰碰条设置为关闭状态
                touchBarJButtonStatusIntArray[i] = 0;
            }
        }
        
        //上诉判断确定了所有碰碰条按钮接下来是要放到北部、还是南部，还有他们的状态是打开还是收缩
        //接下来确定，在中间容器内放入什么内容
        for (int i = 0; i < allTouchBarJButtonArrayList.size(); i++) {
            Component component = (Component) allTouchBarJButtonArrayList.get(i);
            //如果指定的碰碰条，已经被置为展开状态，则把该碰碰条放置到激活碰碰条对象中，同时打开
            if (component == currentClickTouchBarJButton && touchBarJButtonStatusIntArray[i] == 1) {
            	activeTouchBarJButton = currentClickTouchBarJButton;
            	//把指定的要展开碰碰条按钮对应的碰碰条树赋值到中间容器
            	addMenuItemToMenuItemJPanelCenter(touchBarJTreeArray[i]);
            }
        }
 
        //北、中、南三个碰碰条容器，依次重新布局
        navigationJPanel_North.doLayout();
        menuItemJPanel_Center.doLayout();
        navigationJPanel_South.doLayout();
        doLayout();    
    }
	public  JTree getTree()
	{
		//创建根节点和子节点
		DefaultMutableTreeNode rootDefaultMutableTreeNode = new DefaultMutableTreeNode("root");
		DefaultTreeModel defaultTreeModel = new DefaultTreeModel(rootDefaultMutableTreeNode);
		DefaultMutableTreeNode studentDefaultMutableTreeNode = new DefaultMutableTreeNode("学生管理");
		
		defaultTreeModel.insertNodeInto(studentDefaultMutableTreeNode,rootDefaultMutableTreeNode,rootDefaultMutableTreeNode.getChildCount());

		//创建树对象
		JTree tree = new JTree(defaultTreeModel);
		//设置Tree的选择为一次只能选择一个节点
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		//注册监听器
		tree.addTreeSelectionListener((TreeSelectionListener) menuItemJPanel_Center);
		tree.addMouseListener((MouseListener) menuItemJPanel_Center);
		//树的根节点不显示
		tree.setRootVisible(false);
		
		return tree;
	}
}
