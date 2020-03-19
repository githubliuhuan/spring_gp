package com.qianfeng.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by liuhuan on 2020/3/15 22:15
 */
public class MyThrows implements ThrowsAdvice {
    //当核心功能中抛出异常时执行 ex=异常对象
    public void afterThrowing(Exception ex){
//        ex.printStackTrace();
        System.out.println("出现异常啦："+ex.getMessage());

    }
}
