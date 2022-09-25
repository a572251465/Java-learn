package com.lihh;

import com.lihh.config.SpringConfig;
import com.lihh.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = applicationContext.getBean(UserController.class);
        userController.addUser("lxx", 22);
    }
}
