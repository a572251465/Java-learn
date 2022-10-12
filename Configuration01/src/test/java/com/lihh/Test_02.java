package com.lihh;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_02 {
    @Test
    public void run() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfiguration02.class);
        TestBean testBean = (TestBean) applicationContext.getBean("testBean");
        testBean.say();
    }
}
