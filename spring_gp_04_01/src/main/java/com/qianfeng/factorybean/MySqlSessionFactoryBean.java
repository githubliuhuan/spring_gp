package com.qianfeng.factorybean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import javax.annotation.Resource;
import java.io.Reader;

/**
 * Created by liuhuan on 2020/3/7 22:03
 */

/**
 * 工厂Bean，生产SqlSessionFactory
 */
public class MySqlSessionFactoryBean implements FactoryBean<SqlSessionFactory> {
    //主体逻辑，完成某种复杂对象的生产
    @Override
    public SqlSessionFactory getObject() throws Exception {
        //构建过程
        Reader reader = Resources.getResourceAsReader("configuration.xml");
        return new SqlSessionFactoryBuilder().build(reader);
    }

    //返回某种复杂对象的类对象
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //控制复杂对象的创建模式
    @Override
    public boolean isSingleton() {
        return false;
    }
}
