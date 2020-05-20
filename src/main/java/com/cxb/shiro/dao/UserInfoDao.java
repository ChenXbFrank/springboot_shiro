package com.cxb.shiro.dao;

import com.cxb.shiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;


public interface UserInfoDao extends CrudRepository<UserInfo, Integer>{

    UserInfo findByUsername(String username);
}

