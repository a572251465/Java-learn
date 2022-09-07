package com.lihh.thread1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.thread1
 * @Author: lihh
 * @CreateTime: 2022-09-05  10:14
 * @Description: TODO
 */
public class Person1 extends Thread {
  static int nums = 10;

  @Override
  public void run() {
    for (int i = 0; i < 100; i += 1) {
      if (nums > 0) {
        this.exec();
      }
    }
  }

  public static synchronized void exec() {
    if (nums > 0) {
      System.out.println("您在" + Thread.currentThread().getName() + "--抽取了第" + nums-- + "张票");
    }
  }
}
