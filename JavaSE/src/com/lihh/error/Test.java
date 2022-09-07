package com.lihh.error;

import java.util.Scanner;

/**
 * @Author lihh
 * @Date 2022/8/26 - 08 - 26
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数:");
            int num1 = sc.nextInt();

            System.out.println("请输入第二个数:");
            int num2 = sc.nextInt();

            System.out.println("商是：" + num1/ num2);
        } catch (Exception e) {
            System.out.println("程序出错了");
        }

        System.out.println("------------------------1");
        System.out.println("--------------------222");
        System.out.println("--------------------444");
    }
}
