package com.lihh.lambda.demo;

public class Test {
    public static void main(String[] args) {
        // 多种方法：实现接口中的方法

        // 1. 通过实现类 实现接口来调用
        IAction action = new SuperClass();
        System.out.println(action.getObject());

        // 2. 通过匿名内部类来实现
        action = new IAction() {
            @Override
            public Object getObject() {
                return new User("lxx1", 25);
            }
        };
        System.out.println(action.getObject());

        // 3. 通过lambda表达式来
        action = () -> new User("lxx2", 30);
        System.out.println(action.getObject());

        /**
         * 1. 函数式编程
         *  1. 函数是一等公民
         *  2. 函数可以给变量赋值
         *  3. 函数可以是作为参数来使用
         *  4. 函数可以作为返回值来使用
         */
        System.out.println(fn1(() -> new User("lxx9", 23), "User"));
        System.out.println(fn2().getObject());
    }

    // 函数(lambda)可以是作为参数来使用
    public static User fn1(IAction action, String beanName) {
        Object obj = action.getObject();
        if (obj != null && obj.getClass().getSimpleName().equals(beanName)) {
            return (User) obj;
        }
        return null;
    }

    // 函数可以作为返回值来使用
    public static IAction fn2() {
        return () -> new User("lxx6", 22);
    }
}
