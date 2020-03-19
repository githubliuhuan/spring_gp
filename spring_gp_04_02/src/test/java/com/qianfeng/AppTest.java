package com.qianfeng;


import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 测试 jdk反射包中的 动态的代理类构建的API
     */

    @Test
    public void shouldAnswerWithTrue() {
        //动态代理搭建
        //1.目标
        final UserService userService = new UserServiceImpl();
        //2.额外功能
        InvocationHandler ih = new InvocationHandler(){
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("额外功能gp04~~~");
                method.invoke(userService,args);
                System.out.println("额外功能gp04!!!");
                //userService.queryOne();
                return null;
            }
        };

        //3.组装，编织
        UserService proxy = (UserService)Proxy.newProxyInstance(AppTest.class.getClassLoader(), userService.getClass().getInterfaces(),ih);
        proxy.queryOne(1);
        System.out.println("============");
        proxy.insertUser(new User());

    }

    @Test
    public void testDyanmicProxy(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取代理对象，通过目标的Beanid,即可获得
        UserService userServiceProxy = (UserService)context.getBean("UserService");
        userServiceProxy.queryOne(1);
        System.out.println("=============");
        userServiceProxy.insertUser(new User());
    }


}
