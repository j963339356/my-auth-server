package com.auth.demo.service;

import com.auth.demo.common.CommonPage;
import com.auth.demo.dto.UserInfoDto;
import com.auth.demo.mbg.model.Userinfo;

import java.util.List;

/**
 * 用户管理
 */
public interface UserInfoService {
    //获取所有数据
    List<UserInfoDto> listAllUserInfo();

    //分页查询
    CommonPage listUserInfo(UserInfoDto userInfoDto, int pageNum, int pageSize);

    //查询
    UserInfoDto getUserInfo(String id);

    //插入
    int insertUserInfo(UserInfoDto userInfoDto);

    //更新
    int updateUserInfo(String id, UserInfoDto userInfoDto);

    //删除
    int deleteUserInfo(String id);
}
