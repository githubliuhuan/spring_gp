package com.qianfeng.service;

import com.qianfeng.pojo.User;

/**
 * Created by liuhuan on 2020/3/15 18:13
 */

/*
代替UserServiceImpl搭理 额外功能
静态代理类
    1>要和目标保持功能一致：和目标保持同一套接口
    2>组成：目标+额外功能
 */
public class UserServiceProxy implements UserService{
    //原始业务：目标
    private UserServiceImpl userService = new UserServiceImpl();
    @Override
    public Integer insertUser(User user) {
        System.out.println("额外功能");
        return userService.insertUser(user);
    }

    @Override
    public Integer updateUser(User user) {
        System.out.println("额外功能");
        return userService.updateUser(user);
    }

    @Override
    public User queryOne(Integer id) {
        System.out.println("额外功能");
        return userService.queryOne(id);
    }
}
