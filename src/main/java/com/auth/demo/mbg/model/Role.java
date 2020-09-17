package com.auth.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "角色编号")
    private String roleid;

    @ApiModelProperty(value = "角色名称")
    private String name;

    @ApiModelProperty(value = "排序")
    private Integer px;

    @ApiModelProperty(value = "角色类型")
    private Integer type;

    @ApiModelProperty(value = "是否激活")
    private Integer isactive;

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

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPx() {
        return px;
    }

    public void setPx(Integer px) {
        this.px = px;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", roleid=").append(roleid);
        sb.append(", name=").append(name);
        sb.append(", px=").append(px);
        sb.append(", type=").append(type);
        sb.append(", isactive=").append(isactive);
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