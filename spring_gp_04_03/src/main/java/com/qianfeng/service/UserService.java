package com.qianfeng.service;

import com.qianfeng.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by liuhuan on 2020/3/22 10:36
 */
public interface UserService {
    public User queryUserById(@Param("id") Integer id);
    public List<User> queryUsers();
    public Integer insertUser(User user) throws SQLException;
}
