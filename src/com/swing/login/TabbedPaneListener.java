package com.swing.login;

import java.awt.Component;

/**
 * 在状态改变时监听
 */
public interface TabbedPaneListener {

    void tabRemoved(Tab tab, Component component, int index);

    void tabAdded(Tab tab, Component component, int index);

    void tabSelected(Tab tab, Component component, int index);

    void allTabsRemoved();

    boolean canTabClose(Tab tab, Component component);


}
