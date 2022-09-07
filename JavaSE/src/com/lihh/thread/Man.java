package com.lihh.thread;

import java.util.concurrent.Callable;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread
 * @Author: lihh
 * @CreateTime: 2022-09-02  13:41
 * @Description: TODO
 */
public class Man implements Callable {
    @Override
    public Object call() throws Exception {
        int len = 10;
        for (int i = 0; i < len; i++) {
            System.out.println(Thread.currentThread().getName() + "----------" + i);
        }
        return null;
    }
}
