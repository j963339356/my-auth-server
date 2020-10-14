package com.auth.module_ums.dto;

import io.swagger.annotations.ApiModelProperty;

public class PrivilegeAllocateDto {
    @ApiModelProperty(value="模块id")
    private Long moduleId;
    @ApiModelProperty(value="模块名称")
    private String moduleName;
    @ApiModelProperty(value="一级菜单id")
    private String menuId;
    @ApiModelProperty(value="一级菜单名称")
    private String menuTitle;
    @ApiModelProperty(value="二级菜单id")
    private String menu2Id;
    @ApiModelProperty(value="二级菜单名称")
    private String menu2Title;
    @ApiModelProperty(value="资源id")
    private String resourceId;
    @ApiModelProperty(value="资源名称")
    private String resourceName;

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenu2Id() {
        return menu2Id;
    }

    public void setMenu2Id(String menu2Id) {
        this.menu2Id = menu2Id;
    }

    public String getMenu2Title() {
        return menu2Title;
    }

    public void setMenu2Title(String menu2Title) {
        this.menu2Title = menu2Title;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
