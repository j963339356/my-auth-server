package com.auth.module_ums.dto;

import com.auth.mbg.model.UmsUser;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class UserInfoDto extends UmsUser {


        @ApiModelProperty(value = "有效期")
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date expirydate;

        @ApiModelProperty(value = "创建时间")
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date sysCreateTime;

        @ApiModelProperty(value = "修改时间")
        @JsonFormat(pattern = "yyyy-MM-dd")
        private Date sysModifyTime;

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
        public Date getSysCreateTime() {
                return sysCreateTime;
        }

        @Override
        public void setSysCreateTime(Date sysCreateTime) {
                this.sysCreateTime = sysCreateTime;
        }

        @Override
        public Date getSysModifyTime() {
                return sysModifyTime;
        }

        @Override
        public void setSysModifyTime(Date sysModifyTime) {
                this.sysModifyTime = sysModifyTime;
        }

        public static long getSerialVersionUID() {
                return serialVersionUID;
        }
}
