package com.auth.module_ums.service.impl;

import com.auth.common.CommonPage;
import com.auth.mbg.mapper.UmsResourceMapper;
import com.auth.mbg.model.UmsMenu;
import com.auth.mbg.model.UmsMenuExample;
import com.auth.mbg.model.UmsResource;
import com.auth.mbg.model.UmsResourceExample;
import com.auth.module_ums.service.UmsResourceService;
import com.github.pagehelper.PageHelper;
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
        umsResource.setId(id);
        umsResource.setSysModifyTime(new Date());
        return umsResourceMapper.updateByPrimaryKeySelective(umsResource);
    }

    /**
     * 获取资源详情
     *
     * @param id
     */
    @Override
    public UmsResource getUmsResource(String id) {
        return umsResourceMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除资源
     *
     * @param id
     */
    @Override
    public int delete(String id) {
        return umsResourceMapper.deleteByPrimaryKey(id);
    }

    /**
     * 分页查询资源
     *
     * @param umsResource
     * @param pageNum
     * @param pageSize
     */
    @Override
    public CommonPage list(UmsResource umsResource, int pageNum, int pageSize) {
        UmsResourceExample example = new UmsResourceExample();
        UmsResourceExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("sort desc");
        if(umsResource.getName()!=null && !umsResource.getName().isEmpty()){
            criteria.andNameLike("%"+umsResource.getName()+"%");
        }
        if(umsResource.getIsactive()!=null){
            criteria.andIsactiveEqualTo(umsResource.getIsactive());
        }
        if(umsResource.getUrl()!=null && !umsResource.getUrl().isEmpty()){
            criteria.andUrlLike("%"+umsResource.getUrl()+"%");
        }
        criteria.andSysDelEqualTo(1);

        long total = umsResourceMapper.countByExample(example);
        //分页,这个判断防止出现分页错乱
        if(total > pageSize) {
            PageHelper.startPage(pageNum, pageSize);
        }else{
            pageNum = 1;
        }

        List<UmsResource> umsResources = umsResourceMapper.selectByExample(example);

        return CommonPage.result(pageNum,pageSize,new Double(total/pageSize+1).intValue(),total,umsResources);
    }

    /**
     * 查询全部资源
     */
    @Override
    public List<UmsResource> listAll() {
        return umsResourceMapper.selectByExample(new UmsResourceExample());
    }
}
