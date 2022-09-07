package com.lihh.thread1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread1
 * @Author: lihh
 * @CreateTime: 2022-09-05  10:25
 * @Description: TODO
 */
public class Person2 extends Thread {
  static int nums = 10;

  static Lock lock = new ReentrantLock();

  @Override
  public void run() {
    for (int i = 0; i < 100; i += 1) {
      lock.lock();
      if (nums > 0) {
        System.out.println("您在" + Thread.currentThread().getName() + "--抽取了第" + nums-- + "张票");
      }
      lock.unlock();
    }
  }
}
