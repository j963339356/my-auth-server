package com.auth.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsRoleServiceRelation implements Serializable {
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "服务id")
    private Long serviceId;

    @ApiModelProperty(value = "ID")
    private Long roleId;

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

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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
        sb.append(", serviceId=").append(serviceId);
        sb.append(", roleId=").append(roleId);
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