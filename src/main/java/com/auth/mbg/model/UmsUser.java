package com.auth.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsUser implements Serializable {
    @ApiModelProperty(value = "ID")
    private Long id;

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

    @ApiModelProperty(value = "是否激活:1激活,0未激活")
    private Integer isactive;

    @ApiModelProperty(value = "有效期")
    private Date expirydate;

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
        sb.append(", sysCreateUser=").append(sysCreateUser);
        sb.append(", sysCreateTime=").append(sysCreateTime);
        sb.append(", sysModifyUser=").append(sysModifyUser);
        sb.append(", sysModifyTime=").append(sysModifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}