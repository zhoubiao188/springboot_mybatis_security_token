package com.example.auth.demo.service;

import com.example.auth.demo.domain.auth.ResponseUserToken;
import com.example.auth.demo.domain.auth.UserDetail;


public interface AuthService {
    /**
     * 注册用户
     * @param userDetail
     * @return
     */
    UserDetail register(UserDetail userDetail);

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    ResponseUserToken login(String username, String password);


    /**
     * 刷新Token
     * @param oldToken
     * @return
     */
    ResponseUserToken refresh(String oldToken);


    /**
     * 登出
     * @param token
     */
    void logout(String token);


    /**
     * 根据Token获取用户信息
     * @param token
     * @return
     */
    UserDetail getUserByToken(String token);
}
