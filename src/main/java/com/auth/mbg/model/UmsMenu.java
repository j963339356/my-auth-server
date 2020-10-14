package com.auth.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsMenu implements Serializable {
    private String id;

    @ApiModelProperty(value = "父资源id")
    private String pid;

    @ApiModelProperty(value = "模块表ID")
    private Long moduleId;

    private String title;

    private Integer level;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    private String name;

    private String icon;

    @ApiModelProperty(value = "0隐藏,1显示")
    private Integer hidden;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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
        sb.append(", pid=").append(pid);
        sb.append(", moduleId=").append(moduleId);
        sb.append(", title=").append(title);
        sb.append(", level=").append(level);
        sb.append(", sort=").append(sort);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", hidden=").append(hidden);
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