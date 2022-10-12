package com.lihh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_01 {

    @Test
    public void test01() {

        // 使用注解来加载配置文件
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
    }
}
