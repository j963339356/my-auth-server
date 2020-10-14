package com.auth.module_ums.service.impl;

import com.auth.common.CommonPage;
import com.auth.mbg.mapper.UmsModuleMapper;
import com.auth.mbg.model.UmsModule;
import com.auth.mbg.model.UmsModule;
import com.auth.mbg.model.UmsModuleExample;
import com.auth.module_ums.service.UmsModuleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UmsModuleServiceImpl implements UmsModuleService {
    @Autowired
    private UmsModuleMapper umsModuleMapper;
    
    /**
     * 添加资源
     *
     * @param umsModule
     */
    @Override
    public int insert(UmsModule umsModule) {
        umsModule.setSysCreateTime(new Date());
        return umsModuleMapper.insertSelective(umsModule);
    }

    /**
     * 修改资源
     *
     * @param id
     * @param umsModule
     */
    @Override
    public int update(Long id, UmsModule umsModule) {
        umsModule.setId(id);
        umsModule.setSysModifyTime(new Date());
        return umsModuleMapper.updateByPrimaryKeySelective(umsModule);
    }

    /**
     * 获取资源详情
     *
     * @param id
     */
    @Override
    public UmsModule getUmsModule(Long id) {
        return umsModuleMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除资源
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return umsModuleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 分页查询资源
     *
     * @param umsModule
     * @param pageNum
     * @param pageSize
     */
    @Override
    public CommonPage list(UmsModule umsModule, int pageNum, int pageSize) {
        UmsModuleExample example = new UmsModuleExample();
        UmsModuleExample.Criteria criteria = example.createCriteria();
//        example.setOrderByClause("sort desc");
        if(umsModule.getName()!=null && !umsModule.getName().isEmpty()){
            criteria.andNameLike("%"+umsModule.getName()+"%");
        }
        if(umsModule.getIsactive()!=null){
            criteria.andIsactiveEqualTo(umsModule.getIsactive());
        }
        if(umsModule.getUrl()!=null && !umsModule.getUrl().isEmpty()){
            criteria.andUrlLike("%"+umsModule.getUrl()+"%");
        }
        if(umsModule.getHidden()!=null){
            criteria.andHiddenEqualTo(umsModule.getHidden());
        }
        criteria.andSysDelEqualTo(1);

        long total = umsModuleMapper.countByExample(example);
        //分页,这个判断防止出现分页错乱
        if(total > pageSize) {
            PageHelper.startPage(pageNum, pageSize);
        }else{
            pageNum = 1;
        }

        List<UmsModule> umsModules = umsModuleMapper.selectByExample(example);

        return CommonPage.result(pageNum,pageSize,new Double(total/pageSize+1).intValue(),total,umsModules);
    }

    /**
     * 查询全部资源
     */
    @Override
    public List<UmsModule> listAll() {
        return umsModuleMapper.selectByExample(new UmsModuleExample());
    }
}
