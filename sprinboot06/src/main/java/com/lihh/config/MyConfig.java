package com.lihh.config;

import com.lihh.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(value = "user")
    public User getUser() {
        return new User("lxx", 20);
    }
}
