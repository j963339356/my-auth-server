package com.auth.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Resource implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "资源编号")
    private String code;

    @ApiModelProperty(value = "资源名称")
    private String name;

    @ApiModelProperty(value = "资源地址")
    private String url;

    @ApiModelProperty(value = "排序")
    private Integer px;

    @ApiModelProperty(value = "是否激活")
    private Integer isactive;

    @ApiModelProperty(value = "请求类型")
    private String request;

    @ApiModelProperty(value = "服务表id")
    private String servicesId;

    @ApiModelProperty(value = "父资源id")
    private String parentId;

    @ApiModelProperty(value = "描述")
    private String descrip;

    @ApiModelProperty(value = "是否目录")
    private Integer isdirect;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPx() {
        return px;
    }

    public void setPx(Integer px) {
        this.px = px;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getServicesId() {
        return servicesId;
    }

    public void setServicesId(String servicesId) {
        this.servicesId = servicesId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Integer getIsdirect() {
        return isdirect;
    }

    public void setIsdirect(Integer isdirect) {
        this.isdirect = isdirect;
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", px=").append(px);
        sb.append(", isactive=").append(isactive);
        sb.append(", request=").append(request);
        sb.append(", servicesId=").append(servicesId);
        sb.append(", parentId=").append(parentId);
        sb.append(", descrip=").append(descrip);
        sb.append(", isdirect=").append(isdirect);
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