package com.vo;

public class SysMenu {
    private Long id;

    private String menuId;

    private String title;

    private String link;

    private String type;

    private String parentId;

    private String iconCls;

    private Integer iframe;

    private String selfStyle;

    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls == null ? null : iconCls.trim();
    }

    public Integer getIframe() {
        return iframe;
    }

    public void setIframe(Integer iframe) {
        this.iframe = iframe;
    }

    public String getSelfStyle() {
        return selfStyle;
    }

    public void setSelfStyle(String selfStyle) {
        this.selfStyle = selfStyle == null ? null : selfStyle.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}