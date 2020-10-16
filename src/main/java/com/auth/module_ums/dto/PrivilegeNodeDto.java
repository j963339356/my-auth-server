package com.auth.module_ums.dto;

import io.swagger.annotations.ApiModelProperty;

public class PrivilegeNodeDto {
    @ApiModelProperty(value="id")
    private String id;
    @ApiModelProperty(value="名称")
    private String name;
    @ApiModelProperty(value="父节点")
    private String pid;
    @ApiModelProperty(value = "所属模块")
    private String moduleId;
    @ApiModelProperty(value="类型：0：模块，1：一级菜单，2：二级菜单，3：资源")
    private int type;
    @ApiModelProperty(value="是否选择")
    private Boolean checked = false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }
}
