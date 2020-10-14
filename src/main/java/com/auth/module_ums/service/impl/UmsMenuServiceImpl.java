package com.auth.module_ums.service.impl;

import com.auth.common.CommonPage;
import com.auth.mbg.mapper.UmsMenuMapper;
import com.auth.mbg.model.UmsMenu;
import com.auth.mbg.model.UmsMenuExample;
import com.auth.module_ums.dto.UmsMenuNodeDto;
import com.auth.module_ums.service.UmsMenuService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UmsMenuService实现类
 */
@Service
public class UmsMenuServiceImpl implements UmsMenuService {
    @Autowired
    private UmsMenuMapper umsMenuMapper;

    /**
     * 获取所有菜单列表
     * @return
     */
    @Override
    public List<UmsMenu> listAllUmsMenu() {
        return umsMenuMapper.selectByExample(new UmsMenuExample());
    }

    /**
     * 分页获取菜单列表
     * @param umsMenu
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public CommonPage listUmsMenu(UmsMenu umsMenu, int pageNum, int pageSize) {
        UmsMenuExample example = new UmsMenuExample();
        UmsMenuExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("sort desc");
        if(umsMenu.getTitle()!=null && !umsMenu.getTitle().isEmpty()){
            criteria.andTitleLike("%"+umsMenu.getTitle()+"%");
        }
        if(umsMenu.getLevel()!=null){
            criteria.andLevelEqualTo(umsMenu.getLevel());
        }
        //默认pid为0获取1级菜单，或者其他级别菜单
        if(umsMenu.getPid()!=null && !umsMenu.getPid().isEmpty()){
            criteria.andPidEqualTo(umsMenu.getPid());
        }
        if(umsMenu.getModuleId()!=null){
            criteria.andModuleIdEqualTo(umsMenu.getModuleId());
        }
        criteria.andSysDelEqualTo(1);

        long total = umsMenuMapper.countByExample(example);
        //分页,这个判断防止出现分页错乱
        if(total > pageSize) {
            PageHelper.startPage(pageNum, pageSize);
        }else{
            pageNum = 1;
        }

        List<UmsMenu> umsMenuList = umsMenuMapper.selectByExample(example);

        return CommonPage.result(pageNum,pageSize,new Double(total/pageSize+1).intValue(),total,umsMenuList);
    }

    /**
     * 查找
     * @param id
     * @return
     */
    @Override
    public UmsMenu getUmsMenu(String id) {
        return umsMenuMapper.selectByPrimaryKey(id);
    }

    /**
     * 插入
     * @param umsMenu
     * @return
     */
    @Override
    public int insertUmsMenu(UmsMenu umsMenu) {
        umsMenu.setSysCreateTime(new Date());
        updateLevel(umsMenu);
        return umsMenuMapper.insertSelective(umsMenu);
    }

    /**
     * 修改菜单层级
     */
    private void updateLevel(UmsMenu umsMenu) {
        if (umsMenu.getPid()==null || umsMenu.getPid().isEmpty()) {
            //没有父菜单时为一级菜单
            umsMenu.setLevel(0);
        } else {
            //有父菜单时选择根据父菜单level设置
            UmsMenu parentMenu = umsMenuMapper.selectByPrimaryKey(umsMenu.getPid());
            if (parentMenu != null) {
                umsMenu.setLevel(parentMenu.getLevel() + 1);
            } else {
                umsMenu.setLevel(0);
            }
        }
    }

    /**
     * 更新
     * @param id
     * @param umsMenu
     * @return
     */
    @Override
    public int updateUmsMenu(String id, UmsMenu umsMenu) {
        umsMenu.setId(id);
        updateLevel(umsMenu);
        umsMenu.setSysModifyTime(new Date());
        return umsMenuMapper.updateByPrimaryKeySelective(umsMenu);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int deleteUmsMenu(String id) {
        return umsMenuMapper.deleteByPrimaryKey(id);
    }

    /**
     * 列出树形列表
     * @return
     */
    @Override
    public List<UmsMenuNodeDto> treeList(String pid) {
        UmsMenuExample example = new UmsMenuExample();
        List<UmsMenu> menuList = umsMenuMapper.selectByExample(example);
        //转换成流，做流操作
        List<UmsMenuNodeDto> result = menuList.stream()
                //过滤，得到子菜单
                .filter(subMenu -> subMenu.getPid().equals(pid==null||pid.isEmpty()?"0":pid))
                //递归重复如上操作
                .map(subMenu -> covertMenuNode(subMenu, menuList))
                //将流中的元素变成List数据结构
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public int updateHidden(String id, Integer hidden) {
        UmsMenu umsMenu = new UmsMenu();
        umsMenu.setId(id);
        umsMenu.setHidden(hidden);
        umsMenu.setSysModifyTime(new Date());
        return umsMenuMapper.updateByPrimaryKeySelective(umsMenu);
    }

    /**
     * 将UmsMenu转化为UmsMenuNode并设置children属性
     */
    private UmsMenuNodeDto covertMenuNode(UmsMenu menu, List<UmsMenu> menuList) {
        UmsMenuNodeDto node = new UmsMenuNodeDto();
        BeanUtils.copyProperties(menu, node);
        //转换成流，做流操作
        List<UmsMenuNodeDto> children = menuList.stream()
                //过滤，得到子菜单
                .filter(subMenu -> subMenu.getPid().equals(menu.getId()))
                //递归重复如上操作
                .map(subMenu -> covertMenuNode(subMenu, menuList))
                //将流中的元素变成List数据结构
                .collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
