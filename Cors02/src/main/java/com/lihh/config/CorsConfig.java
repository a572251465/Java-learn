package com.lihh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 设置跨域请求地址
        corsConfiguration.addAllowedOrigin("http://127.0.0.1:9000");
        // 设置跨域请求头
        corsConfiguration.addAllowedHeader("*");
        // 设置跨域请求方法
        corsConfiguration.addAllowedMethod("*");
        // 在跨域请求过程中 使用同一个session
        corsConfiguration.setAllowCredentials(true);

        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 配置可以访问的地址
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}
