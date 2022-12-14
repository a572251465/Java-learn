package com.lihh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类可以自动扫描，当前类所在包以及子包中所有的注解
 * 启动类的存放位置是跟controller包 同一级目录下
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(value = "com.lihh")
public class Springboot01Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }
}
