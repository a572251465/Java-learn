package com.lihh;

import com.lihh.bean.User;
import com.lihh.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sprinboot06ApplicationTests {

    @Autowired
    private User user;
    @Autowired
    private MyConfig myConfig;

    @Test
    void contextLoads() {
        System.out.println(user);
        System.out.println(myConfig.getUser());
    }

}
