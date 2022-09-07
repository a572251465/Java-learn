package com.lihh.string;

/**
 * @Author lihh
 * @Date 2022/8/28 - 08 - 28
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        String s = "abc" + "d";
        String s1 = "abcd";
        String s2 = "ab" + "cd";
        String s3 = "a" + "bcd";

        String s4 = new String("abcd");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
