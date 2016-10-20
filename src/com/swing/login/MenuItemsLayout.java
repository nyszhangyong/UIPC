package com.swing.login;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.Serializable;

/**�˵�����岼�ֹ�����*/
public class MenuItemsLayout implements LayoutManager,Serializable {
	
	private static final long serialVersionUID = 1L;

	int verticalGap = 0;//��ֱ���

    int horizontalGap = 0;//ˮƽ���

    public MenuItemsLayout() {
    }

    public MenuItemsLayout(int horizontalGap, int verticalGap) {
        this.horizontalGap = horizontalGap;
        this.verticalGap = verticalGap;
    }

    /**����touchBarMenuItemsJPanel������N���˵����λ��*/
    public void layoutContainer(Container touchBarMenuItemsJPanel) {
    	//ͬ������Ŀ���ǣ�������touchBarMenuItemsJPanel�в˵���Ĳ���λ��û�����ʱ��������ʼ�µĲ���
        synchronized (touchBarMenuItemsJPanel.getTreeLock()) {
        	//����touchBarMenuItemsJPanel����TouchBarJPanel�ıߵľ���
        	//�˴�һ������£����븸�����������Ҿ�Ϊ0
            Insets insets = touchBarMenuItemsJPanel.getInsets();
            //�õ�touchBarMenuItemsJPanel�����Ĳ˵�������
            int componentCount = touchBarMenuItemsJPanel.getComponentCount();
            if (componentCount == 0) {
                return;
            }
            int y = insets.top + verticalGap;
            for (int i = 0; i < componentCount; i++) {
                //�˵���Ŀ�ȵ��ڣ�touchBarMenuItemsJPanel���Ŀ��
            	//��ȥtouchBarMenuItemsJPanel����TouchBarJPanel�������ߵľ���
            	//�ټ�ȥ��������Ԥ���ļ�϶
                int width=touchBarMenuItemsJPanel.getWidth() - insets.left - insets.right - 2* horizontalGap;
                int height = touchBarMenuItemsJPanel.getComponent(i).getPreferredSize().height;
                
                //�˵����x����λ�õ��ڣ�touchBarMenuItemsJPanel����TouchBarJPanel��ߵľ���+Ԥ����ˮƽ��϶
                int x=insets.left + horizontalGap;
                touchBarMenuItemsJPanel.getComponent(i).setBounds(x,y,width, height);
                
                //�˵����y����λ�õ��ڣ�ѭ������N���˵���Ĵ��ϵ����ۼƵĸ߶ȣ�����Ԥ���Ĵ�ֱ��϶
                y += height + verticalGap;
            }
        }
    }
    
    /**����touchBarMenuItemsJPanel�����Ŵ�С*/
    public Dimension preferredLayoutSize(Container touchBarMenuItemsJPanel) {
    	//ͬ������Ŀ���ǣ�������touchBarMenuItemsJPanel�в˵���Ĵ�Сû�����ʱ��������ʼ�µļ���
        synchronized (touchBarMenuItemsJPanel.getTreeLock()) {
        	//����touchBarMenuItemsJPanel����TouchBarJPanel�ıߵľ���
        	//�˴�һ������£����븸�����������Ҿ�Ϊ0
            Insets insets = touchBarMenuItemsJPanel.getInsets();
            //�õ�touchBarMenuItemsJPanel�����Ĳ˵�������
            int componentCount = touchBarMenuItemsJPanel.getComponentCount();
            int width = 0;
            int height = 0;
            for (int i = 0; i < componentCount; i++) {
                Component component = touchBarMenuItemsJPanel.getComponent(i);
                Dimension dimension = component.getPreferredSize();
                //ѭ�����������MenuItems�ۼƵĿ���
                if (width < dimension.width) {
                	width = dimension.width;
                }
                height += dimension.height + verticalGap;
            }
            //���¼���Ŀ���ǳ���TouchBarJPanel����������
            //touchBarMenuItemsJPanel��ȵ��ڣ�touchBarMenuItemsJPanel����TouchBarJPanel�������ߵľ���
            //���ϸղż�����Ĳ˵���ĳߴ磬�ٳ�����������Ԥ���ļ�϶
            int widthTemp=insets.left + insets.right + width + 2 * horizontalGap;
            //touchBarMenuItemsJPanel�߶ȵ��ڣ�touchBarMenuItemsJPanel����TouchBarJPanel�������ߵľ���
            //���ϸղż�����Ĳ˵���ĳߴ磬�ٳ�����������Ԥ���ļ�϶
            int heightTemp=insets.top + insets.bottom + height + 2 * verticalGap;
            
            return new Dimension(widthTemp,heightTemp);
        }
    }
    
    /**����touchBarMenuItemsJPanel����С��С*/
    public Dimension minimumLayoutSize(Container parentContainer) {
        return preferredLayoutSize(parentContainer);
    }
    
    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }
}
