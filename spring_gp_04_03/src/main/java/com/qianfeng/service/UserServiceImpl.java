package com.qianfeng.service;

import com.qianfeng.dao.UserDAO;
import com.qianfeng.pojo.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by liuhuan on 2020/3/22 10:36
 */
//@Setter
@Service // <bean class="当前类" id="首字母小写类名：userServiceImpl">
// @Service("us") //自定义beanId
// @Scope("prototype") //原型模式
@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,readOnly = false,rollbackFor = Exception.class) //当前类中的所有方法，都切入事务
public class UserServiceImpl implements UserService{

    //@Autowired //基于类型为当前属性，自动注入
    @Resource
    private UserDAO userDAO;

    /*@Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }*/

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User queryUserById(Integer id) {
       /* try {
            throw new SQLException("test");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        if(1==1){
            throw new SQLException("test");
        }*/
        // int a = 1/0;
        return userDAO.queryUserById(id);
    }

    @Override
    public List<User> queryUsers() {
        return userDAO.queryUsers();
    }

    //则类上的事务属性，对此方法无效
    @Override
    public Integer insertUser(User user) throws SQLException {
        /*return userDAO.insertUser(user);*/
        Integer integer = userDAO.insertUser(user);
        // int a = 10/0;
        if(1==1){
            //throw new SQLException("test");
        }
        return integer;
    }
}
