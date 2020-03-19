package com.qianfeng.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by liuhuan on 2020/3/15 21:56
 * 环绕的额外功能
 */
public class MyMethodInterceptor implements MethodInterceptor {

    /**
     *
     * @param mi
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("begin tx~~~");
        //接收业务执行结果
        Object ret = mi.proceed();//执行目标的 核心功能
        System.out.println("end tx~~~");
        return ret; //业务结果 向上返回
    }
}
