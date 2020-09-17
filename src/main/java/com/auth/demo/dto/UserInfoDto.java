package com.auth.demo.dto;

import com.auth.demo.mbg.model.Userinfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class UserInfoDto extends Userinfo {


        @ApiModelProperty(value = "有效期")
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date expirydate;

        @ApiModelProperty(value = "创建时间")
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date sysCjsj;

        @ApiModelProperty(value = "修改时间")
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date sysXgsj;

        private static final long serialVersionUID = 1L;


        public Date getExpirydate() {
            return expirydate;
        }

        public void setExpirydate(Date expirydate) {
            this.expirydate = expirydate;
        }

        public Date getSysCjsj() {
            return sysCjsj;
        }

        public void setSysCjsj(Date sysCjsj) {
            this.sysCjsj = sysCjsj;
        }

        public Date getSysXgsj() {
            return sysXgsj;
        }

        public void setSysXgsj(Date sysXgsj) {
            this.sysXgsj = sysXgsj;
        }

}