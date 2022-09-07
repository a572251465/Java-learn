package com.lihh.thread;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread
 * @Author: lihh
 * @CreateTime: 2022-09-02  13:38
 * @Description: TODO
 */
public class TestUser {
    public static void main(String[] args) {
        User u = new User();
        Thread t = new Thread(u);
        t.setName("测试");
        t.start();

        int len = 10;
        for (int i = 0; i < len; i++) {
            System.out.println(Thread.currentThread().getName() + "----------" + i);
        }
    }
}
