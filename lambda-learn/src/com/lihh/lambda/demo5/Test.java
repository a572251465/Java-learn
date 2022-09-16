package com.lihh.lambda.demo5;

public class Test {
    public static void main(String[] args) {
        // 通过lambda表达式函数 来实现
        System.out.println(get(name -> {
            return new Person(name);
        }));;

        // 通过函数引用来实现
        System.out.println(get(Person::new));;
    }

    public static Person get(IAction action) {
        return action.get("test");
    }
}
