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
	
	//�������������
	private JPanel navigationJPanel_North;
	
	//�������в����-����������
	private JScrollPane navigationJScrollPane_Center;
	
	//�������ϲ����-��ͨ����
	private MenuItemJPanel menuItemJPanel_Center;
	
	//�������ϲ����
	private JPanel navigationJPanel_South;
	
    //�������������ť
    private JButton activeTouchBarJButton;
        
    //����������������ť��List
    private ArrayList<JButton> allTouchBarJButtonArrayList;
    
	//����������������ť״̬�����飨չ����������
    private int[] touchBarJButtonStatusIntArray;
    
    //�������˵�����
    private JTree[] touchBarJTreeArray;
	
    //���췽��
	public LeftNavigationJPanel() {
		
		this.setLayout(new BorderLayout());
		
		allTouchBarJButtonArrayList = new ArrayList<JButton>();
		
		//�������������
		navigationJPanel_North=new JPanel();
		navigationJPanel_North.setLayout(new MenuItemsLayout());
		//navigationJPanel_North.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        this.add(navigationJPanel_North, BorderLayout.NORTH);
        
        //�������в����
		navigationJScrollPane_Center=new JScrollPane();
		menuItemJPanel_Center=new MenuItemJPanel();		
		menuItemJPanel_Center.setLayout(new MenuItemsLayout());
		//menuItemJPanel_Center.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
		navigationJScrollPane_Center = new JScrollPane(menuItemJPanel_Center);
        this.add(navigationJScrollPane_Center, BorderLayout.CENTER);
        
        //�������ϲ����
		navigationJPanel_South=new JPanel();		
		navigationJPanel_South.setLayout(new MenuItemsLayout());
		//navigationJPanel_South.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
        this.add(navigationJPanel_South, BorderLayout.SOUTH);
	}
    
    //��ʼ��������Ŀ¼��
    public LeftNavigationJPanel startCreateLeftNavigationJPanel() {
    	LeftNavigationJPanel leftNavigationJPanel=new LeftNavigationJPanel();
    	//������������ĿΪ2��
    	int touchBarCount=2;
        //ʵ����������չ��������״̬����
    	leftNavigationJPanel.setTouchBarJButtonStatusIntArray(touchBarCount);
    	//ʵ�����������˵�������
    	leftNavigationJPanel.setTouchBarJTreeArray(touchBarCount);
    	
        for (int i = 0; i < touchBarCount; i++) {
        	//Ϊÿһ����������ť������
        	leftNavigationJPanel.addTouchBarJButton(i,"TouchBarJButton" + i);
        	//Ϊÿһ����������ť�����˵�����
        	leftNavigationJPanel.setTouchBarJButtonJTree(i,leftNavigationJPanel.getTree());
        	//Ϊÿһ����������ť������Ĭ������״̬��0����������
        	leftNavigationJPanel.setTouchBarJButtonStatus(i,0);
        }
        
        //չ��ָ����������ť(Ĭ��չ����һ���˵���)
        leftNavigationJPanel.expandTouchBarJPanel(leftNavigationJPanel.allTouchBarJButtonArrayList.get(0));
        return leftNavigationJPanel;
    }
    
    /**���ã�ʵ����������չ��������״̬����*/
	public void setTouchBarJButtonStatusIntArray(int touchBarJButtonStatusIntArray) {
		this.touchBarJButtonStatusIntArray = new int[touchBarJButtonStatusIntArray];
	}

    /**���ã�ָ����������״̬,0=���� 1=չ��*/
	public void setTouchBarJButtonStatus(int i,int status) {
		this.touchBarJButtonStatusIntArray[i] = status;
	}
	
    /**���ã�ʵ�����������˵�������*/
	public void setTouchBarJTreeArray(int touchBarJTreeArray) {
		this.touchBarJTreeArray = new JTree[touchBarJTreeArray];
	}
	
    /**���ã�ָ���������˵�����*/
	public void setTouchBarJButtonJTree(int i,JTree jTree) {
		this.touchBarJTreeArray[i] = jTree;
	}

    /**���ӣ�����һ����������ָ�����������ƣ� */
    public void addTouchBarJButton(int index, String name) {
    	addTouchBarJButton(index, name, UIManager.getColor("Desktop.background"));
    }
    
    /**���ӣ�����һ����������ָ�����������ơ�����ɫ�� */
    public void addTouchBarJButton(int index, String name, Color backgroundColor) {
        JButton touchBarJButton= addTouchBarJButton(navigationJPanel_North, index, name, backgroundColor);
        touchBarJButton.addActionListener(jButtonActionListener);
        this.allTouchBarJButtonArrayList.add(index, touchBarJButton);
    }
    
    /**���ӣ�����һ����������ť��ָ�����������ơ�����ɫ�� */
    private JButton addTouchBarJButton(JPanel jPanel, int index, String name,Color bg) {
    	JButton touchBarJButton = new JButton(name);
        jPanel.add(touchBarJButton);
        return touchBarJButton;
    }
    
    
    /**���ӣ���ָ���������в���ָ���˵��ָ���������������ţ��˵�����������Զ����㵱ǰ�������еĲ˵���������1��*/
    public void addMenuItemToMenuItemJPanelCenter(Component menuItem) {
    	menuItemJPanel_Center.add(menuItem);
    }
    
    /**��ѯ���õ�������������ť����*/
    public int getAllTouchBarJButtonCount() {
        return allTouchBarJButtonArrayList.size();
    }
    
    /**������������ť����¼�*/
    transient ActionListener jButtonActionListener = new ActionListener() {
        //transient�ؼ���ֻ�����α���,���������η�������,��transient�ؼ������εı��������ܱ����л�
        public void actionPerformed(ActionEvent actionEvent) {
            JButton currentClickTouchBarJButton = (JButton) actionEvent.getSource();
            expandTouchBarJPanel(currentClickTouchBarJButton);
        }
    };
    
    /**չ����չ��ָ�������� */
    protected void expandTouchBarJPanel(JButton currentClickTouchBarJButton) {
        //JOptionPane.showMessageDialog(null,currentClickTouchBarJButton.getText(), "��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
    	//ָ��������λ������������ArrayList�еĵڼ���
        int num = 0;
        //��ձ����С��������ֵ������������
        navigationJPanel_North.removeAll();
        menuItemJPanel_Center.removeAll();
        navigationJPanel_South.removeAll();
    	
        //�Ƿ��ҵ���Ҫչ���ĺϲ���������Ĭ��û���ҵ�
        boolean hasAddCenter = false;
        //�������е�������
        for (int i = 0; i < allTouchBarJButtonArrayList.size(); i++) {
            Component component = (Component) allTouchBarJButtonArrayList.get(i);
            //�������ϲ���������ʱ��֤���������������ڱ��߾������ϱ�����
            //��Ϊֻ�б������ϲ������ר�Ŵ洢�ϲ���������
            //�м�������ר�Ŵ洢չ������
            //�˴���if��else����жϴ����Ŀ��ֻ��һ����
            //�Ǿ���ȷ��������������ť��������Ҫ�ŵ������������ϲ����������ǵ�״̬�Ǵ򿪣�
            //�����������˴����жϲ���������м������ŵ�����
            if (touchBarJButtonStatusIntArray[i] == 0) {
                if (hasAddCenter) {
                	//��һ��ѭ�������жϲ���ִ�У���ΪĬ����false������һ�λ�ֱ��ִ���¸��ж�
                	//�ڶ���ѭ����ʼִ�У��������֮ǰ�Ѿ��ҵ���Ҫչ���ĺϲ��������������Ѿ��ŵ����м�����
                	//��ôʣ�µĺϲ���������ȫ���ƶ����ϲ����
                	navigationJPanel_South.add(component);
                } else if (component == currentClickTouchBarJButton) {
                	//����������������ť�Ǻϲ�״̬�ģ���ô��������ʱ�����ϲ������Ǳ�����
                	//��������һ���������������������Ϊ��������Ҫ���м���ʾ�����Ա��ⰴť������ڱ�������
                	navigationJPanel_North.add(component);
                    //Ȼ��ѵ�ǰ�����������״̬��Ϊ1�������Ѿ���
                    touchBarJButtonStatusIntArray[i] = 1;
                    //��¼�µ�ǰ�����������λ������������ArrayList�еĵڼ���
                    num = i + 1;
                    //��ǵ�ǰ�������������Ѿ���ռ���м�������������������ť��ռ���м�����
                    hasAddCenter = true;
                } else {
                	//����������ĵ�ǰ������������Ҫչ������������������ŵ��������
                	navigationJPanel_North.add(component);
                }
            } else {//������չ����������ʱ��֤�������м�����
            	
            	//�����ǰ�м������е���������������null���͹رգ�Ȼ����Ϊnull����
                if (activeTouchBarJButton != null) {
                	//���۵�ǰ������Ƿ�������չ���İ�ť��
                	//��ǰ����չ���İ�ť����Ҫ�رգ��������Ҫ�ر�����
                	//���������ťҲ��Ҫ�ر�������˴˴�ֻ�йر�һ������
                	//menuItemJPanel_Center.removeAll();
                	activeTouchBarJButton = null;
                }
                
                //�����������չ�������������ǵ�ǰ�������������ť
                if (component == currentClickTouchBarJButton) {
                	navigationJPanel_North.add(component);
                } else if (num == 0) {
                	//�����������ϲ�������������ô��������չ����������ʱ��numһ������0����˷ŵ��������
                	navigationJPanel_North.add(component);
                }else {//֤����ǰ������Ǳ���������������˰�չ�����������ŵ��ϲ�
                	navigationJPanel_South.add(component);
                }
                //��ָ��������������Ϊ�ر�״̬
                touchBarJButtonStatusIntArray[i] = 0;
            }
        }
        
        //�����ж�ȷ����������������ť��������Ҫ�ŵ������������ϲ����������ǵ�״̬�Ǵ򿪻�������
        //������ȷ�������м������ڷ���ʲô����
        for (int i = 0; i < allTouchBarJButtonArrayList.size(); i++) {
            Component component = (Component) allTouchBarJButtonArrayList.get(i);
            //���ָ�������������Ѿ�����Ϊչ��״̬����Ѹ����������õ����������������У�ͬʱ��
            if (component == currentClickTouchBarJButton && touchBarJButtonStatusIntArray[i] == 1) {
            	activeTouchBarJButton = currentClickTouchBarJButton;
            	//��ָ����Ҫչ����������ť��Ӧ������������ֵ���м�����
            	addMenuItemToMenuItemJPanelCenter(touchBarJTreeArray[i]);
            }
        }
 
        //�����С��������������������������²���
        navigationJPanel_North.doLayout();
        menuItemJPanel_Center.doLayout();
        navigationJPanel_South.doLayout();
        doLayout();    
    }
	public  JTree getTree()
	{
		//�������ڵ���ӽڵ�
		DefaultMutableTreeNode rootDefaultMutableTreeNode = new DefaultMutableTreeNode("root");
		DefaultTreeModel defaultTreeModel = new DefaultTreeModel(rootDefaultMutableTreeNode);
		DefaultMutableTreeNode studentDefaultMutableTreeNode = new DefaultMutableTreeNode("ѧ������");
		
		defaultTreeModel.insertNodeInto(studentDefaultMutableTreeNode,rootDefaultMutableTreeNode,rootDefaultMutableTreeNode.getChildCount());

		//����������
		JTree tree = new JTree(defaultTreeModel);
		//����Tree��ѡ��Ϊһ��ֻ��ѡ��һ���ڵ�
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		//ע�������
		tree.addTreeSelectionListener((TreeSelectionListener) menuItemJPanel_Center);
		tree.addMouseListener((MouseListener) menuItemJPanel_Center);
		//���ĸ��ڵ㲻��ʾ
		tree.setRootVisible(false);
		
		return tree;
	}
}
