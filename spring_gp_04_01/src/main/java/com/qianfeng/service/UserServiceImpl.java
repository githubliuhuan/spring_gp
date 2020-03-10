package com.qianfeng.service;

import com.qianfeng.dao.UserDAO;
import com.qianfeng.dao.UserDAOImpl;
import com.qianfeng.pojo.User;

/**
 * Created by liuhuan on 2020/3/7 10:10
 */
//组件的稳健度
public class UserServiceImpl implements UserService {
    //强耦合
    //private UserDAO userDAO = new UserDAOImpl();

    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        System.out.println("set DAO for Service");
        this.userDAO = userDAO;
    }

    @Override
    public void insertUser(User user) {
        System.out.println("insert user in Service");
        System.out.println("userDAO"+userDAO);
        userDAO.insertUser(user);
    }
}
