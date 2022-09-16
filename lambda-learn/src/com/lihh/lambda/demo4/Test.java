package com.lihh.lambda.demo4;

public class Test {
    public static void main(String[] args) {
        // 这种通过函数引用的方式
        console(Tools::console);

        // 1. 这种通过lambda 表达式来形容
        console(message -> {
            System.out.println(message);
        });
    }

    public static void console(IAction action) {
        action.console("hello");
    }
}

class Tools {
    static void console(String name) {
        System.out.println(name);
    }
}