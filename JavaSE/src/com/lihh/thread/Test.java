package com.lihh.thread;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread
 * @Author: lihh
 * @CreateTime: 2022-09-02  09:35
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        // 如果要启动定义线程 需要调用重写方法start
        p.start();

        int len = 10;
        for (int i = 0; i < len; i++) {
            System.out.println("main---------" + (i + 1));
        }
    }
}
