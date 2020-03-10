package com.qianfeng;

import static org.junit.Assert.assertTrue;

import com.qianfeng.dao.UserDAO;
import com.qianfeng.di.ConsComponent;
import com.qianfeng.di.SetComponent;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * 工厂启动
     */
    @Test
    public void factoryBoot() {
        //启动工厂
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从工厂获取组件
        /*UserDAO userDAO = (UserDAO)context.getBean("userDAO04");
        UserDAO userDao2 = context.getBean("userDAO04", UserDAO.class);
        userDAO.insertUser(new User());*/

        UserService userService04 = context.getBean("userService04", UserService.class);
        userService04.insertUser(new User());
    }

    @Test
    public void testDI() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SetComponent dic4 = context.getBean("dic4", SetComponent.class);
        System.out.println("================");
    }

    @Test
    public void testDI2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ConsComponent dic4 = context.getBean("consDI04", ConsComponent.class);
        System.out.println("================");
    }

    @Test
    public void testDI3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("=====");
    }

    @Test
    public void testMode() {
        //启动工厂
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从工厂获取组件
        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        UserDAO userDAO2 = (UserDAO) context.getBean("userDAO");
        UserDAO userDAO3 = (UserDAO) context.getBean("userDAO");
        System.out.println(userDAO == userDAO2);
        System.out.println(userDAO == userDAO3);
    }

    @Test
    public void testLife() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("userDAO1").toString());
        System.out.println(context.getBean("userDAO1").toString());
        System.out.println("=====");
        context.close();
    }

    @Test
    public void testFactoryBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取工厂bean的生产对象
        Object o = context.getBean("mySqlSessionFactory");
        System.out.println("=====");
    }
}