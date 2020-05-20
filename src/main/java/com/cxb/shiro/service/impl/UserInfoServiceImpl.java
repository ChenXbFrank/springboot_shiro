package com.cxb.shiro.service.impl;


import javax.annotation.Resource;

import com.cxb.shiro.dao.UserInfoDao;
import com.cxb.shiro.entity.UserInfo;
import com.cxb.shiro.service.UserInfoService;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao dao;

    public UserInfo findByUsername(String username) {
        return dao.findByUsername(username);
    }

}
