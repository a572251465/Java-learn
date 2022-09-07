package com.lihh.generic;

/**
 * @Author lihh
 * @Date 2022/8/29 - 08 - 29
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person<String> p = new Person<>();
        p.setName("lihh");
        p.setSchool("xxx");

        System.out.println(p.toString());


    }
}
