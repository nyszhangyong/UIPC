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
	//����TreeSelectionEvent�¼�
	public void valueChanged(TreeSelectionEvent treeSelectionEvent)
	{
//		JTree tree = (JTree)treeSelectionEvent.getSource();
//		//��ȡĿǰѡȡ�Ľڵ�
//		DefaultMutableTreeNode selectionNode =(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
//		JOptionPane.showMessageDialog(null, selectionNode.toString(), "��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE); 
//		MainFrame.tabbedPane.addTab(selectionNode.toString(), null, new JLabel("����һ"));
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		if(mouseEvent.getClickCount() == 2){
			JTree tree = (JTree)mouseEvent.getSource();			
			DefaultMutableTreeNode selectionNode =(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			//˫�������ڵ������
			String treeNodeName=selectionNode.toString();
			//ѭ���жϵ�ǰTAB�����У�������û��������ͬ��TABҳ
			int size=MainFrame.tabbedPane.getTabCount();
			boolean isHasTab=false;
			for(int i=0;i<size;i++){
				String tabName=MainFrame.tabbedPane.getTabAt(i).getName();
				if(tabName.equals(treeNodeName)){
					isHasTab=true;
				}
			}
			
			if(isHasTab){
				//��ͬ���ĳ�����ֱ�Ӷ�λ����TABҳ
			}else{
				//û��ͬ���ģ�����TABҳ������TABҳ
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
