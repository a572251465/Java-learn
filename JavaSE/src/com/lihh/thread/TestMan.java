package com.lihh.thread;

import java.util.concurrent.FutureTask;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread
 * @Author: lihh
 * @CreateTime: 2022-09-02  13:43
 * @Description: TODO
 */
public class TestMan {
    public static void main(String[] args) {
        Man m = new Man();
        FutureTask ft = new FutureTask(m);
        Thread t = new Thread(ft);
        t.setName("我就是子类");
        t.start();

        int len = 10;
        for (int i = 0; i < len; i++) {
            System.out.println(Thread.currentThread().getName() + "----------" + i);
        }
    }
}
