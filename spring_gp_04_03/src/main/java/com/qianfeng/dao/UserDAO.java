package com.qianfeng.dao;

import com.qianfeng.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by liuhuan on 2020/3/20 11:30
 */
public interface UserDAO {
    public User queryUserById(@Param("id") Integer id);
    public List<User> queryUsers();
    public Integer insertUser(User user);
}
