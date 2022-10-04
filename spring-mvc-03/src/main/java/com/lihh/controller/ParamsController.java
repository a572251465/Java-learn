package com.lihh.controller;

import com.lihh.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ParamsController {

    /*紧耦合方式参数注入
     * 使用传统的HttpServletRequest对象获取参数  javax.servlet
     * */
    @RequestMapping(value = "getParam1")
    public String getParam1(HttpServletRequest req, HttpServletResponse res) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        return "my";
    }

    /*解耦合方式参数注入
     * HttpServletRequest对象获取参数 通过SpringMVC框架功能,自动转换参数
     * 处理单元参数列表中参数名必须和请求中的参数名一致
     * 如不一致,可以通过@RequestParma注解进行转换
     * */
    @RequestMapping(value = "getParam2")
    public String getParam2(String username, @RequestParam("pwd") String password) {
        return "my";
    }

    /**
     * 可以接受一个实体类，但是传递每个字段都必须跟实体类中每个字段名字有所映射
     */
    @RequestMapping(value = "getParam3")
    public String getParams3(User user) {
        System.out.println(user);
        return "my";
    }
}
