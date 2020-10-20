package com.auth.module_ums.service;

import com.auth.common.CommonPage;
import com.auth.mbg.model.UmsRole;
import com.auth.mbg.model.UmsRoleResourceRelation;
import com.auth.module_ums.dto.PrivilegeNodeDto;

import java.util.List;

public interface UmsRoleService {
    /**
     * 添加角色
     */
    int insert(UmsRole umsRole);

    /**
     * 修改角色
     */
    int update(Long id, UmsRole umsRole);

    /**
     * 获取角色详情
     */
    UmsRole getUmsRole(Long id);

    /**
     * 删除角色
     */
    int delete(Long id);

    /**
     * 分页查询角色
     */
    CommonPage list(UmsRole umsRole, int pageNum, int pageSize);

    /**
     * 查询全部角色
     */
    List<UmsRole> listAll();

    /**
     * 权限分配页面表格
     */
    List<PrivilegeNodeDto> getPrivilegeAllocate();

    /**
     * 分配权限
     */
    int grantPrivileges(Long roleId,List<PrivilegeNodeDto> privilegeList);

    /**
     * 获取已分配权限
     */
    List<UmsRoleResourceRelation> hasGrantPrivileges(Long roleId);
}
