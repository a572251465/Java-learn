package com.lihh5;

/**
 * @Author lihh
 * @Date 2022/8/25 - 08 - 25
 * @Description: Java-learn
 * @version: 1.0
 */
public class Dog extends Animal{
    @Override
    public void say() {
        System.out.println("我是小狗狗，我要说");
    }

    public void eat() {
        System.out.println("我是小狗狗，我要吃");
    }
}
