package com.lihh.lambda.demo6;

public class Test {
    public static void main(String[] args) {
        // 使用lambda表达式的方式进行调用
        print(message -> {
            System.out.println(message);
        });

        // 使用函数引用的方式
        Tools tools = new Tools();
        print(tools::say);
    }

    public static void print(IAction action) {
        action.print("test");
    }
}

class Tools {
    public void say(String message) {
        System.out.println(message);
    }
}
