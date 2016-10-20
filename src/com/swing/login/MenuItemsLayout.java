package com.swing.login;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.Serializable;

/**菜单项面板布局管理器*/
public class MenuItemsLayout implements LayoutManager,Serializable {
	
	private static final long serialVersionUID = 1L;

	int verticalGap = 0;//垂直间距

    int horizontalGap = 0;//水平间距

    public MenuItemsLayout() {
    }

    public MenuItemsLayout(int horizontalGap, int verticalGap) {
        this.horizontalGap = horizontalGap;
        this.verticalGap = verticalGap;
    }

    /**设置touchBarMenuItemsJPanel包含的N个菜单项的位置*/
    public void layoutContainer(Container touchBarMenuItemsJPanel) {
    	//同步锁的目的是：当计算touchBarMenuItemsJPanel中菜单项的布局位置没有完成时，不允许开始新的布局
        synchronized (touchBarMenuItemsJPanel.getTreeLock()) {
        	//返回touchBarMenuItemsJPanel距离TouchBarJPanel四边的距离
        	//此处一般情况下：距离父容器上下左右均为0
            Insets insets = touchBarMenuItemsJPanel.getInsets();
            //得到touchBarMenuItemsJPanel包含的菜单项数量
            int componentCount = touchBarMenuItemsJPanel.getComponentCount();
            if (componentCount == 0) {
                return;
            }
            int y = insets.top + verticalGap;
            for (int i = 0; i < componentCount; i++) {
                //菜单项的宽度等于：touchBarMenuItemsJPanel面板的宽度
            	//减去touchBarMenuItemsJPanel距离TouchBarJPanel左右两边的距离
            	//再减去左右两边预定的间隙
                int width=touchBarMenuItemsJPanel.getWidth() - insets.left - insets.right - 2* horizontalGap;
                int height = touchBarMenuItemsJPanel.getComponent(i).getPreferredSize().height;
                
                //菜单项的x坐标位置等于：touchBarMenuItemsJPanel距离TouchBarJPanel左边的距离+预定的水平间隙
                int x=insets.left + horizontalGap;
                touchBarMenuItemsJPanel.getComponent(i).setBounds(x,y,width, height);
                
                //菜单项的y坐标位置等于：循环到的N个菜单项的从上到下累计的高度，加上预定的垂直间隙
                y += height + verticalGap;
            }
        }
    }
    
    /**设置touchBarMenuItemsJPanel的最优大小*/
    public Dimension preferredLayoutSize(Container touchBarMenuItemsJPanel) {
    	//同步锁的目的是：当计算touchBarMenuItemsJPanel中菜单项的大小没有完成时，不允许开始新的计算
        synchronized (touchBarMenuItemsJPanel.getTreeLock()) {
        	//返回touchBarMenuItemsJPanel距离TouchBarJPanel四边的距离
        	//此处一般情况下：距离父容器上下左右均为0
            Insets insets = touchBarMenuItemsJPanel.getInsets();
            //得到touchBarMenuItemsJPanel包含的菜单项数量
            int componentCount = touchBarMenuItemsJPanel.getComponentCount();
            int width = 0;
            int height = 0;
            for (int i = 0; i < componentCount; i++) {
                Component component = touchBarMenuItemsJPanel.getComponent(i);
                Dimension dimension = component.getPreferredSize();
                //循环计算出所有MenuItems累计的宽、高
                if (width < dimension.width) {
                	width = dimension.width;
                }
                height += dimension.height + verticalGap;
            }
            //以下计算目的是充满TouchBarJPanel的整个窗口
            //touchBarMenuItemsJPanel宽度等于：touchBarMenuItemsJPanel距离TouchBarJPanel左右两边的距离
            //加上刚才计算出的菜单项的尺寸，再乘以左右两边预定的间隙
            int widthTemp=insets.left + insets.right + width + 2 * horizontalGap;
            //touchBarMenuItemsJPanel高度等于：touchBarMenuItemsJPanel距离TouchBarJPanel上下两边的距离
            //加上刚才计算出的菜单项的尺寸，再乘以上下两边预定的间隙
            int heightTemp=insets.top + insets.bottom + height + 2 * verticalGap;
            
            return new Dimension(widthTemp,heightTemp);
        }
    }
    
    /**设置touchBarMenuItemsJPanel的最小大小*/
    public Dimension minimumLayoutSize(Container parentContainer) {
        return preferredLayoutSize(parentContainer);
    }
    
    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }
}
