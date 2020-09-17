package com.auth.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class MapRoleservices implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "角色id")
    private String roleId;

    @ApiModelProperty(value = "服务id")
    private String servicesId;

    @ApiModelProperty(value = "是否删除")
    private Integer sysDel;

    @ApiModelProperty(value = "创建人")
    private String sysCjr;

    @ApiModelProperty(value = "创建时间")
    private Date sysCjsj;

    @ApiModelProperty(value = "修改人")
    private String sysXgr;

    @ApiModelProperty(value = "修改时间")
    private Date sysXgsj;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getServicesId() {
        return servicesId;
    }

    public void setServicesId(String servicesId) {
        this.servicesId = servicesId;
    }

    public Integer getSysDel() {
        return sysDel;
    }

    public void setSysDel(Integer sysDel) {
        this.sysDel = sysDel;
    }

    public String getSysCjr() {
        return sysCjr;
    }

    public void setSysCjr(String sysCjr) {
        this.sysCjr = sysCjr;
    }

    public Date getSysCjsj() {
        return sysCjsj;
    }

    public void setSysCjsj(Date sysCjsj) {
        this.sysCjsj = sysCjsj;
    }

    public String getSysXgr() {
        return sysXgr;
    }

    public void setSysXgr(String sysXgr) {
        this.sysXgr = sysXgr;
    }

    public Date getSysXgsj() {
        return sysXgsj;
    }

    public void setSysXgsj(Date sysXgsj) {
        this.sysXgsj = sysXgsj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", servicesId=").append(servicesId);
        sb.append(", sysDel=").append(sysDel);
        sb.append(", sysCjr=").append(sysCjr);
        sb.append(", sysCjsj=").append(sysCjsj);
        sb.append(", sysXgr=").append(sysXgr);
        sb.append(", sysXgsj=").append(sysXgsj);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}