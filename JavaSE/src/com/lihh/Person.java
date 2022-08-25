package com.lihh;

/**
 * @Author lihh
 * @Date 2022/8/21 - 08 - 21
 * @Description: Java-learn
 * @version: 1.0
 */
public class Person {
    String name;
    int age;
    double height;
    double weight;

    public void eat() {
        System.out.println("我在吃饭");
    }

    public void sleep(String address) {
        System.out.println("我在" + address + "睡觉");
    }

    public String introduce() {
        return "我的名字是：" + this.name + ", 我的年龄是：" + this.age;
    }
}
