package com.auth.module_ums.service;

import com.auth.common.CommonPage;
import com.auth.mbg.model.UmsModule;

import java.util.List;

public interface UmsModuleService {
    /**
     * 添加资源
     */
    int insert(UmsModule umsModule);

    /**
     * 修改资源
     */
    int update(Long id, UmsModule umsModule);

    /**
     * 获取资源详情
     */
    UmsModule getUmsModule(Long id);

    /**
     * 删除资源
     */
    int delete(Long id);

    /**
     * 分页查询资源
     */
    CommonPage list(UmsModule umsModule, int pageNum, int pageSize);

    /**
     * 查询全部资源
     */
    List<UmsModule> listAll();
}
