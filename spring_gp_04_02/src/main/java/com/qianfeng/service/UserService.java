package com.qianfeng.service;
import com.qianfeng.pojo.User;

/**
 * Created by liuhuan on 2020/3/15 18:04
 */
public interface UserService {
    public Integer insertUser(User user);
    public Integer updateUser(User user);
    public User queryOne(Integer id);
}
