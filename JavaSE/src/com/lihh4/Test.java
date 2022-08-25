package com.lihh4;

/**
 * @Author lihh
 * @Date 2022/8/24 - 08 - 24
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person("li", 20);
        Person p1 = new Person("li", 20);
        System.out.println(p);
        System.out.println(p.toString()); // com.lihh4.Person@1b6d3586

        System.out.println(p == p1);
        System.out.println(p.equals(p1));
    }
}
