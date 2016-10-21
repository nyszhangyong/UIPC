package com.vo;

import java.util.List;


/**
 * 菜单页面显示实体
 */
public class SysMenuVO extends SysMenu{

    /**
     * 子节点
     */
    private List<SysMenuVO> children;

    public List<SysMenuVO> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenuVO> children) {
        this.children = children;
    }
}
