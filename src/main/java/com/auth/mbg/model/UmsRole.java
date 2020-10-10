package com.auth.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsRole implements Serializable {
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "角色名称")
    private String name;

    private String description;

    @ApiModelProperty(value = "角色类型，1普通，2权限管理（权限管理只能分配权限平台的功能，用于给别人配权限）")
    private Integer type;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "是否激活:1激活,0未激活")
    private Integer isactive;

    @ApiModelProperty(value = "是否删除,1正常,0删除")
    private Integer sysDel;

    @ApiModelProperty(value = "创建人")
    private String sysCreateUser;

    @ApiModelProperty(value = "创建时间")
    private Date sysCreateTime;

    @ApiModelProperty(value = "修改人")
    private String sysModifyUser;

    @ApiModelProperty(value = "修改时间")
    private Date sysModifyTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public Integer getSysDel() {
        return sysDel;
    }

    public void setSysDel(Integer sysDel) {
        this.sysDel = sysDel;
    }

    public String getSysCreateUser() {
        return sysCreateUser;
    }

    public void setSysCreateUser(String sysCreateUser) {
        this.sysCreateUser = sysCreateUser;
    }

    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }

    public String getSysModifyUser() {
        return sysModifyUser;
    }

    public void setSysModifyUser(String sysModifyUser) {
        this.sysModifyUser = sysModifyUser;
    }

    public Date getSysModifyTime() {
        return sysModifyTime;
    }

    public void setSysModifyTime(Date sysModifyTime) {
        this.sysModifyTime = sysModifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", sort=").append(sort);
        sb.append(", isactive=").append(isactive);
        sb.append(", sysDel=").append(sysDel);
        sb.append(", sysCreateUser=").append(sysCreateUser);
        sb.append(", sysCreateTime=").append(sysCreateTime);
        sb.append(", sysModifyUser=").append(sysModifyUser);
        sb.append(", sysModifyTime=").append(sysModifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}