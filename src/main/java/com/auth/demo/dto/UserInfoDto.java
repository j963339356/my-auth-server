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


        @Override
        public Date getExpirydate() {
            return expirydate;
        }

        @Override
        public void setExpirydate(Date expirydate) {
            this.expirydate = expirydate;
        }

        @Override
        public Date getSysCjsj() {
            return sysCjsj;
        }

        @Override
        public void setSysCjsj(Date sysCjsj) {
            this.sysCjsj = sysCjsj;
        }

        @Override
        public Date getSysXgsj() {
            return sysXgsj;
        }

        @Override
        public void setSysXgsj(Date sysXgsj) {
            this.sysXgsj = sysXgsj;
        }

}
