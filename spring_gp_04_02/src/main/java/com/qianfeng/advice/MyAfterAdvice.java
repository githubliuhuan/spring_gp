package com.qianfeng.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by liuhuan on 2020/3/15 21:45
 */
public class MyAfterAdvice implements AfterReturningAdvice {
    /**
     *在核心功能返回之后执行
     * @param o 核心功能返回值
     * @param method 方法对象
     * @param objects 方法的参数表
     * @param o1 目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("After ~~ ret:"+o+"method:"+method.getName());
    }
}
