package com.cxb.shiro.service;

        import com.cxb.shiro.entity.UserInfo;

public interface UserInfoService {
    UserInfo findByUsername(String username);
}
