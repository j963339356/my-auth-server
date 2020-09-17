package com.auth.demo.service.impl;

import com.auth.demo.common.CommonPage;
import com.auth.demo.dto.UserInfoDto;
import com.auth.demo.mbg.mapper.UserinfoMapper;
import com.auth.demo.mbg.model.Userinfo;
import com.auth.demo.mbg.model.UserinfoExample;
import com.auth.demo.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Example;
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
    private UserinfoMapper userinfoMapper;

    /**
     * 获取所有数据
     * @return
     */
    @Override
    public List<UserInfoDto> listAllUserInfo() {
        List<Userinfo> userinfoList = userinfoMapper.selectByExample(new UserinfoExample());
        List<UserInfoDto> dtoList = new ArrayList<>();

        for ( Userinfo userinfo: userinfoList) {
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


        Userinfo userInfo = new Userinfo();
        BeanUtils.copyProperties(userInfoDto,userInfo);

        UserinfoExample userinfoExample = new UserinfoExample();
        UserinfoExample.Criteria criteria = userinfoExample.createCriteria();

        if(userInfo.getNickname()!=null && userInfo.getNickname().trim().length()>0){
            criteria.andNicknameLike("%"+userInfo.getNickname()+"%");
        }
        if(userInfo.getUsername()!=null && userInfo.getUsername().trim().length()>0){
            criteria.andUsernameLike("%"+userInfo.getUsername()+"%");
        }
        if(userInfo.getIsactive()!=null){
            criteria.andIsactiveEqualTo(userInfo.getIsactive());
        }

        long total = userinfoMapper.countByExample(userinfoExample);

        //分页,这个判断防止出现分页错乱
        if(total > pageSize) {
            PageHelper.startPage(pageNum, pageSize);
        }else{
            pageNum = 1;
        }
        List<Userinfo> userinfoList = userinfoMapper.selectByExample(userinfoExample);
        List<UserInfoDto> dtoList = new ArrayList<>();

        for ( Userinfo userinfo: userinfoList) {
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
    public UserInfoDto getUserInfo(String id) {
        Userinfo userinfo = userinfoMapper.selectByPrimaryKey(id);
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
        Userinfo userInfo = new Userinfo();
        BeanUtils.copyProperties(userInfoDto,userInfo);

        //获取创建人
//        userInfo.setSysCjr();
        userInfo.setSysCjsj(new Date());
        userInfo.setId(UUID.randomUUID().toString());

        return userinfoMapper.insertSelective(userInfo);
    }

    /**
     * 更新
     *
     * @param id
     * @param userInfoDto
     * @return
     */
    @Override
    public int updateUserInfo(String id, UserInfoDto userInfoDto) {
        Userinfo userInfo = new Userinfo();
        BeanUtils.copyProperties(userInfoDto,userInfo);

        return userinfoMapper.updateByPrimaryKey(userInfo);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteUserInfo(String id) {
        return userinfoMapper.deleteByPrimaryKey(id);
    }
}
