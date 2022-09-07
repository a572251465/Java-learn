package com.lihh.string;

/**
 * @Author lihh
 * @Date 2022/8/27 - 08 - 27
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        String s = "char";
        char[] value = new char['a'];
        System.out.println(s);

        String s1 = "abc";
        String s2 = "aba";
        System.out.println(s1.compareTo(s2)); // 2   c 99 -  a 97
    }
}
