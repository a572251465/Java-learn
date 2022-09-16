package com.lihh.lambda.demo1;

public class Test {
    public static void main(String[] args) {
        // 1. 默认格式
        IMath math = (int a, int b) -> {
            return a + b;
        };
        System.out.println(math.add(1, 2));

        // 2. 省略大括号
        ISay say = (String message) -> System.out.println(message);
        say.say("测试/ 省略大括号");

        // 3. 省略小括号
        say = message -> {
            System.out.println("hello" + message);
        };
        say.say("world");

        // 4. 省略参数
        math = (a, b) -> a + b;
        System.out.println(math.add(3, 4));
    }
}
