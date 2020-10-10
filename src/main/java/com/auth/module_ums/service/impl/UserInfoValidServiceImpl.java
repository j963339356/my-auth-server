package com.auth.module_ums.service.impl;

import com.auth.module_ums.dao.UserInfoValidDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoValidServiceImpl {
    @Autowired
    private UserInfoValidDao userInfoValidDao;

    public int validUserUsername(String username){
        return userInfoValidDao.validUserUsername(username);
    }
}
