package com.lihh;

/**
 * @Author lihh
 * @Date 2022/8/21 - 08 - 21
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person zs = new Person();
        zs.name = "张三";
        zs.age = 20;

        Person ls = new Person();
        ls.name = "李四";
        ls.age = 21;

        zs.eat();
        ls.eat();

        zs.sleep("教室");

        String introduce = zs.introduce();
        System.out.println(introduce);
    }
}
