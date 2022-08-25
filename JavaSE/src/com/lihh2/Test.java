package com.lihh2;

/**
 * @Author lihh
 * @Date 2022/8/22 - 08 - 22
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    int a;
    static int b;
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a = 10;
        t1.b = 20;

        Test t2 = new Test();
        t2.a = 30;
        t2.b = 40;

        System.out.println(t1.a);
        System.out.println(t1.b);

        System.out.println(t2.a);
        System.out.println(t2.b);
    }
}
