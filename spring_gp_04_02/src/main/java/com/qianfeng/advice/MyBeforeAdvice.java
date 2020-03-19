package com.qianfeng.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by liuhuan on 2020/3/15 19:26
 * 前置额外功能
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    /**
     * 主体逻辑，在核心功能之前执行
     * @param method 方法的参数
     * @param args 当前执行的方法对象
     * @param target 方法的参数
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before~~~,method："+method.getName()+" args: "+args.length+" target: "+target);
    }
}
