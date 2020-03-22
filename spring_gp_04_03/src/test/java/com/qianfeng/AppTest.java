package com.qianfeng;

import static org.junit.Assert.assertTrue;

import com.qianfeng.dao.UserDAO;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * dao整合测试
     */
    @Test
    public void testDAO()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO)context.getBean("userDAO");
        System.out.println(userDAO.getClass());
        User user = new User(null,"spring_mybatis","123",new Date());
        userDAO.insertUser(user);
        System.out.println("user's id:"+user.getId());
        System.out.println("==========");
        User user1 = userDAO.queryUserById(user.getId());
        System.out.println(user1);

    }

    @Test
    public void testTx() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
        UserService userService = (UserService)context.getBean("userServiceImpl");
        User user = new User(null, "spring_tx", "123", new Date());
        userService.insertUser(user);
        User user1 = userService.queryUserById(user.getId());
        System.out.println(user1);
    }

    @Test
    public void testDataSource() throws SQLException{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory04");
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        sqlSession1.getConnection();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        sqlSession2.getConnection();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        sqlSession3.getConnection();
        SqlSession sqlSession4 = sqlSessionFactory.openSession();
        sqlSession4.getConnection();
    }
}
