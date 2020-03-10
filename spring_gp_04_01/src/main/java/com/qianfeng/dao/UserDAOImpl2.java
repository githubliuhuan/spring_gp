package com.qianfeng.dao;

import com.qianfeng.pojo.User;

/**
 * Created by liuhuan on 2020/3/7 10:10
 */
public class UserDAOImpl2 implements UserDAO {
    @Override
    public void insertUser(User user) {
        System.out.println("insert user in DAO");
    }
}
