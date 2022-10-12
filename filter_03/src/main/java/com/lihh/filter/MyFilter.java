package com.lihh.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("myFilter request");

        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.setCharacterEncoding("utf-8");

        System.out.println("myFiler response");
        servletResponse.getWriter().print("filter response 添加一些数据");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
