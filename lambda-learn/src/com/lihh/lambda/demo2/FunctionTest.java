package com.lihh.lambda.demo2;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        System.out.println(transform(Integer::parseInt, s -> s + 10, s -> s *= 10));;
    }

    public static int transform(Function<String, Integer> one, Function<Integer, Integer> two, Function<Integer, Integer> three) {
        return one.andThen(two).andThen(three).apply("123");
    }
}
