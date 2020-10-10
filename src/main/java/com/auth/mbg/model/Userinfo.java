package com.auth.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "简介")
    private String profile;

    @ApiModelProperty(value = "联系方式")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "是否激活")
    private Integer isactive;

    @ApiModelProperty(value = "有效期")
    private Date expirydate;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", profile=").append(profile);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", age=").append(age);
        sb.append(", isactive=").append(isactive);
        sb.append(", expirydate=").append(expirydate);
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