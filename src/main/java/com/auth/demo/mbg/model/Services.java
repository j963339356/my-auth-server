package com.auth.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Services implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "服务名")
    private String name;

    @ApiModelProperty(value = "是否激活")
    private Integer isactive;

    @ApiModelProperty(value = "地址")
    private String url;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        sb.append(", name=").append(name);
        sb.append(", isactive=").append(isactive);
        sb.append(", url=").append(url);
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