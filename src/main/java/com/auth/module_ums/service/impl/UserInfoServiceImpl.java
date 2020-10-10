package com.auth.module_ums.service.impl;

import com.auth.common.CommonPage;
import com.auth.mbg.mapper.UmsUserMapper;
import com.auth.mbg.model.UmsUser;
import com.auth.mbg.model.UmsUserExample;
import com.auth.module_ums.dto.UserInfoDto;
import com.auth.module_ums.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * UserInfoService实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UmsUserMapper umsUserMapper;

    /**
     * 获取所有数据
     * @return
     */
    @Override
    public List<UserInfoDto> listAllUserInfo() {
        List<UmsUser> userinfoList = umsUserMapper.selectByExample(new UmsUserExample());
        List<UserInfoDto> dtoList = new ArrayList<>();

        for ( UmsUser userinfo: userinfoList) {
            UserInfoDto userInfoDto = new UserInfoDto();
            BeanUtils.copyProperties(userinfo,userInfoDto);
            dtoList.add(userInfoDto);
        }
        return dtoList;
    }

    /**
     * 分页查询
     *
     * @param userInfoDto
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public CommonPage listUserInfo(UserInfoDto userInfoDto, int pageNum, int pageSize) {


        UmsUser userInfo = new UmsUser();
        BeanUtils.copyProperties(userInfoDto,userInfo);

        UmsUserExample userinfoExample = new UmsUserExample();
        UmsUserExample.Criteria criteria = userinfoExample.createCriteria();

        if(userInfo.getNickname()!=null && userInfo.getNickname().trim().length()>0){
            criteria.andNicknameLike("%"+userInfo.getNickname()+"%");
        }
        if(userInfo.getUsername()!=null && userInfo.getUsername().trim().length()>0){
            criteria.andUsernameLike("%"+userInfo.getUsername()+"%");
        }
        if(userInfo.getIsactive()!=null){
            criteria.andIsactiveEqualTo(userInfo.getIsactive());
        }

        long total = umsUserMapper.countByExample(userinfoExample);

        //分页,这个判断防止出现分页错乱
        if(total > pageSize) {
            PageHelper.startPage(pageNum, pageSize);
        }else{
            pageNum = 1;
        }
        List<UmsUser> userinfoList = umsUserMapper.selectByExample(userinfoExample);
        List<UserInfoDto> dtoList = new ArrayList<>();

        for ( UmsUser userinfo: userinfoList) {
            UserInfoDto dto = new UserInfoDto();
            BeanUtils.copyProperties(userinfo,dto);
            dtoList.add(dto);
        }

        return CommonPage.result(pageNum,pageSize,new Double(total/pageSize+1).intValue(),total,dtoList);
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @Override
    public UserInfoDto getUserInfo(long id) {
        UmsUser userinfo = umsUserMapper.selectByPrimaryKey(id);
        UserInfoDto dto = new UserInfoDto();
        BeanUtils.copyProperties(userinfo,dto);
        return dto;
    }

    /**
     * 插入
     *
     * @param userInfoDto
     * @return
     */
    @Override
    public int insertUserInfo(UserInfoDto userInfoDto) {
        UmsUser userInfo = new UmsUser();
        BeanUtils.copyProperties(userInfoDto,userInfo);

        //获取创建人
//        userInfo.setSysCjr();
        userInfo.setSysCreateTime(new Date());

        return umsUserMapper.insertSelective(userInfo);
    }

    /**
     * 更新
     *
     * @param id
     * @param userInfoDto
     * @return
     */
    @Override
    public int updateUserInfo(long id, UserInfoDto userInfoDto) {
        UmsUser userInfo = new UmsUser();
        BeanUtils.copyProperties(userInfoDto,userInfo);

        return umsUserMapper.updateByPrimaryKey(userInfo);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteUserInfo(long id) {
        return umsUserMapper.deleteByPrimaryKey(id);
    }
}
