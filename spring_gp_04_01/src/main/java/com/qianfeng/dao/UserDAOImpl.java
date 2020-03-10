package com.qianfeng.dao;

import com.qianfeng.pojo.User;

/**
 * Created by liuhuan on 2020/3/7 10:10
 */
public class UserDAOImpl implements UserDAO {
    private Integer a;
    @Override
    public void insertUser(User user) {
        System.out.println("insert user in DAO");
    }

    public UserDAOImpl() {
        System.out.println("UserDAO created......");
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        System.out.println("set in userDAO");
        this.a = a;
    }

    public void init04(){
        System.out.println("init in UserDAO");
    }

    public void destory04(){
        System.out.println("destory in UserDAO");
    }
}
