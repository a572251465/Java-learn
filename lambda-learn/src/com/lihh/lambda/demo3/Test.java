package com.lihh.lambda.demo3;

public class Test {
    public static void main(String[] args) {
        say(System.out::println);
    }

    public static void say(ISay say) {
        say.println("test");
    }
}
