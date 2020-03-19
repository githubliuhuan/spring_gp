package com.qianfeng.service;

import com.qianfeng.pojo.User;

/**
 * Created by liuhuan on 2020/3/15 18:08
 */
public class UserServiceImpl2 implements UserService {
    @Override
    public Integer insertUser(User user) {
        //System.out.println("于"+new Date()+"insertUser 被访问");
        //System.out.println("额外功能");
        System.out.println("核心功能 in insert User2222222");
        return 4;
    }

    @Override
    public User queryOne(Integer id) {
        //System.out.println("额外功能");
        System.out.println("核心功能 in query User2222");
        return new User();
    }

    @Override
    public Integer updateUser(User user) {
        System.out.println("核心功能 in update User");
        return 1;
    }
}
