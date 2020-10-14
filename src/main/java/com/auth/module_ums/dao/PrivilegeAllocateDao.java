package com.auth.module_ums.dao;

import com.auth.module_ums.dto.PrivilegeAllocateDto;

import java.util.List;

public interface PrivilegeAllocateDao {
    //权限分配页面表格
    List<PrivilegeAllocateDto> privilegeAllocate();
}
