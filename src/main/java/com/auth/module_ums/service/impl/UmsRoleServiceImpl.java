package com.auth.module_ums.service.impl;

import com.auth.common.CommonPage;
import com.auth.mbg.mapper.UmsRoleMapper;
import com.auth.mbg.mapper.UmsRoleResourceRelationMapper;
import com.auth.mbg.model.UmsRole;
import com.auth.mbg.model.UmsRoleExample;
import com.auth.mbg.model.UmsRoleResourceRelation;
import com.auth.mbg.model.UmsRoleResourceRelationExample;
import com.auth.module_ums.dao.PrivilegeAllocateDao;
import com.auth.module_ums.dto.PrivilegeAllocateDto;
import com.auth.module_ums.dto.PrivilegeNodeDto;
import com.auth.module_ums.service.UmsRoleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleMapper umsRoleMapper;
    @Autowired
    private PrivilegeAllocateDao privilegeAllocateDao;
    @Autowired
    private UmsRoleResourceRelationMapper roleResourceRelationMapper;

    /**
     * 添加角色
     *
     * @param umsRole
     */
    @Override
    public int insert(UmsRole umsRole) {
        umsRole.setSysCreateTime(new Date());
        return umsRoleMapper.insertSelective(umsRole);
    }

    /**
     * 修改角色
     *
     * @param id
     * @param umsRole
     */
    @Override
    public int update(Long id, UmsRole umsRole) {
        umsRole.setId(id);
        umsRole.setSysModifyTime(new Date());
        return umsRoleMapper.updateByPrimaryKeySelective(umsRole);
    }

    /**
     * 获取角色详情
     *
     * @param id
     */
    @Override
    public UmsRole getUmsRole(Long id) {
        return umsRoleMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除角色
     *
     * @param id
     */
    @Override
    public int delete(Long id) {
        return umsRoleMapper.deleteByPrimaryKey(id);
    }

    /**
     * 分页查询角色
     *
     * @param umsRole
     * @param pageNum
     * @param pageSize
     */
    @Override
    public CommonPage list(UmsRole umsRole, int pageNum, int pageSize) {
        UmsRoleExample example = new UmsRoleExample();
        UmsRoleExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("sort desc");
        if(umsRole.getName()!=null && !umsRole.getName().isEmpty()){
            criteria.andNameLike("%"+umsRole.getName()+"%");
        }
        if(umsRole.getIsactive()!=null){
            criteria.andIsactiveEqualTo(umsRole.getIsactive());
        }
        criteria.andSysDelEqualTo(1);

        long total = umsRoleMapper.countByExample(example);
        //分页,这个判断防止出现分页错乱
        if(total > pageSize) {
            PageHelper.startPage(pageNum, pageSize);
        }else{
            pageNum = 1;
        }

        List<UmsRole> umsRoles = umsRoleMapper.selectByExample(example);

        return CommonPage.result(pageNum,pageSize,new Double(total/pageSize+1).intValue(),total,umsRoles);
    }

    /**
     * 查询全部角色
     */
    @Override
    public List<UmsRole> listAll() {
        return umsRoleMapper.selectByExample(new UmsRoleExample());
    }

    /**
     * 权限分配页面表格
     */
    @Override
    public List<PrivilegeNodeDto> getPrivilegeAllocate(){
        List<PrivilegeAllocateDto> privilegeAllocateDtoList = privilegeAllocateDao.privilegeAllocate();
        List<PrivilegeNodeDto> privilegeNodeDtoList = new ArrayList<>();
        //获取模块列表
        List<PrivilegeAllocateDto> moduleList = new ArrayList<>();
        //获取一级菜单列表
        List<PrivilegeAllocateDto> menuList = new ArrayList<>();
        //获取二级菜单列表
        List<PrivilegeAllocateDto> menu2List = new ArrayList<>();
        //获取资源列表
        List<PrivilegeAllocateDto> resourceList = new ArrayList<>();
        //组合
        for (PrivilegeAllocateDto paDto : privilegeAllocateDtoList){
            //添加模块列表
            boolean isExits = false;
            for(PrivilegeAllocateDto item : moduleList){
                if(paDto.getModuleId().equals(item.getModuleId())){
                    isExits = true;
                }
            }
            if(moduleList.size()==0 && paDto.getModuleId()!=null || !isExits){
                moduleList.add(paDto);
            }
            //添加一级菜单列表
            isExits = false;
            for(PrivilegeAllocateDto item : menuList){
                if(paDto.getMenuId().equals(item.getMenuId())){
                    isExits = true;
                }
            }
            if(menuList.size()==0 && paDto.getMenuId()!=null || !isExits){
                menuList.add(paDto);
            }
            //添加二级菜单列表
            isExits = false;
            for(PrivilegeAllocateDto item : menu2List){
                if(paDto.getMenu2Id().equals(item.getMenu2Id())){
                    isExits = true;
                }
            }
            if(menu2List.size()==0 && paDto.getMenu2Id()!=null || !isExits){
                menu2List.add(paDto);
            }
            //添加资源列表
            isExits = false;
            for(PrivilegeAllocateDto item : resourceList){
                if(paDto.getResourceId().equals(item.getResourceId())){
                    isExits = true;
                }
            }
            if(resourceList.size()==0 && paDto.getResourceId()!=null || !isExits){
                resourceList.add(paDto);
            }
        }
        for (PrivilegeAllocateDto module :moduleList) {
            PrivilegeNodeDto dto = new PrivilegeNodeDto();
            dto.setId(module.getModuleId().toString());
            dto.setName(module.getModuleName());
            dto.setType(0);
            privilegeNodeDtoList.add(dto);
            for (PrivilegeAllocateDto menu :menuList) {
                if(menu.getModuleId().equals(module.getModuleId())) {
                    PrivilegeNodeDto dto1 = new PrivilegeNodeDto();
                    dto1.setId(menu.getMenuId());
                    dto1.setPid(dto.getId());
                    dto1.setModuleId(module.getModuleId().toString());
                    dto1.setName(menu.getMenuTitle());
                    dto1.setType(1);
                    privilegeNodeDtoList.add(dto1);
                    for (PrivilegeAllocateDto menu2 :menu2List) {
                        if(menu2.getMenuId().equals(menu.getMenuId())){
                            PrivilegeNodeDto dto2 = new PrivilegeNodeDto();
                            dto2.setId(menu2.getMenu2Id());
                            dto2.setPid(menu.getMenuId());
                            dto2.setModuleId(menu.getModuleId().toString());
                            dto2.setName(menu2.getMenu2Title());
                            dto2.setType(2);
                            privilegeNodeDtoList.add(dto2);
                            for (PrivilegeAllocateDto resource :resourceList) {
                                if(resource.getMenu2Id().equals(menu2.getMenu2Id())) {
                                    PrivilegeNodeDto dto3 = new PrivilegeNodeDto();
                                    dto3.setId(resource.getResourceId());
                                    dto3.setPid(menu2.getMenu2Id());
                                    dto3.setModuleId(module.getModuleId().toString());
                                    dto3.setName(resource.getResourceName());
                                    dto3.setType(3);
                                    privilegeNodeDtoList.add(dto3);
                                }
                            }
                        }
                    }
                }
            }
        }
        //最后加上模块为空的权限
        for (PrivilegeAllocateDto resource :resourceList) {
            if(resource.getModuleId()==null) {
                PrivilegeNodeDto dto3 = new PrivilegeNodeDto();
                dto3.setId(resource.getResourceId());
                dto3.setPid(resource.getMenu2Id());
                dto3.setName(resource.getResourceId());
                dto3.setType(3);
                privilegeNodeDtoList.add(dto3);
            }
        }
        return privilegeNodeDtoList;
    }

    /**
     * 分配权限
     */
    @Override
    public int grantPrivileges(Long roleId,List<PrivilegeNodeDto> privilegeList){
        //先删除当前角色的所有权限再分配
        UmsRoleResourceRelationExample example = new UmsRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<UmsRoleResourceRelation> roleResourceList = roleResourceRelationMapper.selectByExample(example);

        //删除未选择的权限
        for( UmsRoleResourceRelation relation : roleResourceList){
            boolean isDel = true;
            for( PrivilegeNodeDto nodeDto : privilegeList ){
                if( relation.getResourceId().equals(nodeDto.getId())){
                    isDel = false;
                }
            }
            if(isDel) { roleResourceRelationMapper.deleteByPrimaryKey(relation.getId()); }
        }
        //插入已选择的权限
        for( PrivilegeNodeDto nodeDto : privilegeList ){
            boolean isInsert = true;
            for( UmsRoleResourceRelation relation : roleResourceList ){
                if( relation.getResourceId().equals(nodeDto.getId())){
                    isInsert = false;
                }
            }
            if(isInsert) {
                UmsRoleResourceRelation relation = new UmsRoleResourceRelation();
                relation.setRoleId(roleId);
                relation.setResourceId(nodeDto.getId());
                relation.setSysCreateTime(new Date());
                roleResourceRelationMapper.insertSelective(relation);
            }
        }
        return privilegeList.size();
    }

    /**
     * 获取已分配权限
     */
    @Override
    public List<UmsRoleResourceRelation> hasGrantPrivileges(Long roleId){
        UmsRoleResourceRelationExample example = new UmsRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        return roleResourceRelationMapper.selectByExample(example);
    }
}
