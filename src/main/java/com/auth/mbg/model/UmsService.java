package com.auth.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsService implements Serializable {
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "服务名")
    private String name;

    @ApiModelProperty(value = "地址")
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        sb.append(", url=").append(url);
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