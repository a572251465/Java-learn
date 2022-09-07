package com.lihh.thread;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread
 * @Author: lihh
 * @CreateTime: 2022-09-02  13:36
 * @Description: TODO
 */
public class User implements Runnable {

    @Override
    public void run() {
        int len = 10;
        for (int i = 0; i < len; i++) {
            System.out.println(Thread.currentThread().getName() + "----------" + i);
        }
    }
}
