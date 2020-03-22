package com.qianfeng.aspect;

import lombok.extern.apachecommons.CommonsLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by liuhuan on 2020/3/22 15:24
 * 日志切面类
 */
@Aspect //声明当前组件为一个切面组件
@Component //声明当前组件
@Order(2)
public class MyLogAspect {

    //定义切入点
    @Pointcut("execution(* com.qianfeng..UserServiceImpl.*(..))")
    public void log04(){
    }

    //定义额外功能
    @Before("log04()")
    public void mylog(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println(methodName+" 于 "+new Date()+"被访问啦");
    }
}
