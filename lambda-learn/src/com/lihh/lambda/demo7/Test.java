package com.lihh.lambda.demo7;

public class Test {
    public static void main(String[] args) {
        // 使用lambda表达式的方式
        int[] a = gen(length -> {
            return new int[length];
        });

        // 使用函数引用的方式进行执行
        int[] b = gen(int[]::new);
        System.out.println(a.length);
        System.out.println(b.length);
    }

    public static int[] gen(IAction action) {
        return action.genArr(10);
    }
}
