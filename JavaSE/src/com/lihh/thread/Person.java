package com.lihh.thread;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread
 * @Author: lihh
 * @CreateTime: 2022-09-02  09:33
 * @Description: TODO
 */
public class Person extends Thread {

    @Override
    public void run() {
        int len = 10;
        for (int i = 0; i < len; i++) {
            System.out.println("Person--" + (i + 1));
        }
    }
}
