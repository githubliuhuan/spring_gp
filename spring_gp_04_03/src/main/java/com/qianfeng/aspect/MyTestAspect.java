package com.qianfeng.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by liuhuan on 2020/3/22 15:24
 * 日志切面类
 */
@Aspect //声明当前组件为一个切面组件
@Component //声明当前组件
@Order(1)
public class MyTestAspect {

    //定义切入点
    @Pointcut("execution(* com.qianfeng..UserServiceImpl.*(..))")
    public void pc04(){
    }

    //定义额外功能
    @Before("pc04()")
    public void mylog(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("before~~~~~~~~~``");
    }

    //return="ret" 将目标的返回值赋值给 ret形参
    @AfterReturning(value = "pc04()",returning = "ret")
    public void myAfter(Object ret){
        System.out.println("myAfter~~~~~~~~~~，ret："+ret);
    }

    @Around("pc04()")
    public Object myInterceptor(ProceedingJoinPoint p) throws Throwable{
        System.out.println("interceptor1~~~");
        Object ret = p.proceed(); // 调用核心逻辑
        System.out.println("interceptor2~~~");
        return ret;
    }

    @AfterThrowing(value = "pc04()",throwing="ex")
    public void myThrows(Exception ex){
        System.out.println("出错啦，"+ex.getMessage());
    }
}
