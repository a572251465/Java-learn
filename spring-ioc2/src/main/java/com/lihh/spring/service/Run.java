package com.lihh.spring.service;

import com.lihh.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Run {
    /*
     *@Autowired
     * 根据类型到容器中去寻找对应的对象,找到后给当前属性赋值
     * 不需要依赖 set方法
     * 属性类型可以是接口,会自动匹配对应的实现类对象
     * @Autowired配合 @Qualifier,可以通过名称指定注入的对象
     *
     * @Resource 如果不配置name 那么就是根据类型注入
     * @Resource(name="userDaoImplB") 配置name,就是根据名称注入
     *
     *
     * @Resource  是JDK中javax包的注解
     * @Autowired 和 @Qualifier 是spring中的注解
     *
     * @Value 可以个普通属性赋值
     * @Value 可以使用${}这种表达式获取系统的变量值
     *        或者是.properties属性配置文件中的值
     *
     * */
    @Autowired
    private UserDao userDao;

    public void add() {
        userDao.add();
        System.out.println("这是service层的");
    }
}
