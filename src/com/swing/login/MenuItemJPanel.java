package com.swing.login;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class MenuItemJPanel  extends JPanel implements TreeSelectionListener,MouseListener{

	private static final long serialVersionUID = 1L;

	public MenuItemJPanel() {
	}

	public static void main(String[] args) {

	}

	@Override
	//处理TreeSelectionEvent事件
	public void valueChanged(TreeSelectionEvent treeSelectionEvent)
	{
//		JTree tree = (JTree)treeSelectionEvent.getSource();
//		//获取目前选取的节点
//		DefaultMutableTreeNode selectionNode =(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
//		JOptionPane.showMessageDialog(null, selectionNode.toString(), "提示消息",JOptionPane.WARNING_MESSAGE); 
//		MainFrame.tabbedPane.addTab(selectionNode.toString(), null, new JLabel("测试一"));
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		if(mouseEvent.getClickCount() == 2){
			JTree tree = (JTree)mouseEvent.getSource();			
			DefaultMutableTreeNode selectionNode =(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			//双击的树节点的名称
			String treeNodeName=selectionNode.toString();
			//循环判断当前TAB容器中，现在有没有名字相同的TAB页
			int size=MainFrame.tabbedPane.getTabCount();
			boolean isHasTab=false;
			for(int i=0;i<size;i++){
				String tabName=MainFrame.tabbedPane.getTabAt(i).getName();
				if(tabName.equals(treeNodeName)){
					isHasTab=true;
				}
			}
			
			if(isHasTab){
				//有同名的程序，则直接定位到该TAB页
			}else{
				//没有同名的，则在TAB页中新增TAB页
				//JOptionPane.showMessageDialog(null,"doubleClicked!");
				PageTable frame = new PageTable();
                frame.setVisible(true);
				MainFrame.tabbedPane.addTab(treeNodeName, null,frame);				
			}

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
