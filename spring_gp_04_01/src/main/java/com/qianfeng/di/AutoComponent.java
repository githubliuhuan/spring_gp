package com.qianfeng.di;

import com.qianfeng.dao.UserDAO;

/**
 * Created by liuhuan on 2020/3/7 16:33
 */
public class AutoComponent {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
