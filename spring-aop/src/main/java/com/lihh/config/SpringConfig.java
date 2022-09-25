package com.lihh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "com.lihh")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
