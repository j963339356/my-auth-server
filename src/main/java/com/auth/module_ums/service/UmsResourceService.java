package com.auth.module_ums.service;

import com.auth.mbg.model.UmsMenu;
import com.auth.mbg.model.UmsResource;

import java.util.List;

public interface UmsResourceService {
    /**
     * 添加资源
     */
    int insert(UmsResource umsResource);

    /**
     * 修改资源
     */
    int update(String id, UmsResource umsResource);

    /**
     * 获取资源详情
     */
    UmsResource getUmsResource(String id);

    /**
     * 删除资源
     */
    int delete(String id);

    /**
     * 分页查询资源
     */
    List<UmsResource> list(UmsResource umsResource, int pageNum, int pageSize);

    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();
}
