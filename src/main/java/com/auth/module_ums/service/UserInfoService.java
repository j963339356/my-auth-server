package com.auth.module_ums.service;

import com.auth.common.CommonPage;
import com.auth.module_ums.dto.UserInfoDto;

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
    UserInfoDto getUserInfo(long id);

    //插入
    int insertUserInfo(UserInfoDto userInfoDto);

    //更新
    int updateUserInfo(long id, UserInfoDto userInfoDto);

    //删除
    int deleteUserInfo(long id);
}
