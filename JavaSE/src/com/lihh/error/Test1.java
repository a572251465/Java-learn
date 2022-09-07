package com.lihh.error;

/**
 * @Author lihh
 * @Date 2022/8/26 - 08 - 26
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("lxx");
        p.setAge(20);
        try {
            p.setSex('1');
        } catch (Exception e) {
            System.out.println(e);
        } finally {

        }
        System.out.println(p.toString());
    }
}
