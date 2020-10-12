package com.auth.module_ums.service.impl;

import com.auth.mbg.mapper.UmsResourceMapper;
import com.auth.mbg.model.UmsResource;
import com.auth.module_ums.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UmsResourceServiceImpl implements UmsResourceService {
    @Autowired
    private UmsResourceMapper umsResourceMapper;

    /**
     * 添加资源
     *
     * @param umsResource
     */
    @Override
    public int insert(UmsResource umsResource) {
        umsResource.setSysCreateTime(new Date());
        return umsResourceMapper.insertSelective(umsResource);
    }

    /**
     * 修改资源
     *
     * @param id
     * @param umsResource
     */
    @Override
    public int update(String id, UmsResource umsResource) {
        return 0;
    }

    /**
     * 获取资源详情
     *
     * @param id
     */
    @Override
    public UmsResource getUmsResource(String id) {
        return null;
    }

    /**
     * 删除资源
     *
     * @param id
     */
    @Override
    public int delete(String id) {
        return 0;
    }

    /**
     * 分页查询资源
     *
     * @param umsResource
     * @param pageNum
     * @param pageSize
     */
    @Override
    public List<UmsResource> list(UmsResource umsResource, int pageNum, int pageSize) {
        return null;
    }

    /**
     * 查询全部资源
     */
    @Override
    public List<UmsResource> listAll() {
        return null;
    }
}
