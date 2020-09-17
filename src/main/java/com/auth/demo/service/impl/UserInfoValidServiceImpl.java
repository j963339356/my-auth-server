package com.auth.demo.service.impl;

import com.auth.demo.dao.UserInfoValidDao;
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
