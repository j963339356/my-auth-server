package com.auth.module_ums.service;

import com.auth.common.CommonPage;
import com.auth.mbg.model.UmsMenu;
import com.auth.module_ums.dto.UmsMenuNodeDto;

import java.util.List;

public interface UmsMenuService {
    //获取所有数据
    List<UmsMenu> listAllUmsMenu();

    //分页查询
    CommonPage listUmsMenu(UmsMenu umsMenu, int pageNum, int pageSize);

    //查询
    UmsMenu getUmsMenu(String id);

    //插入
    int insertUmsMenu(UmsMenu userInfoDto);

    //更新
    int updateUmsMenu(String id, UmsMenu umsMenu);

    //删除
    int deleteUmsMenu(String id);

    /**
     * 树形结构返回所有菜单列表
     */
    List<UmsMenuNodeDto> treeList(String pid);

    /**
     * 修改菜单显示状态
     */
    int updateHidden(String id, Integer hidden);
}
