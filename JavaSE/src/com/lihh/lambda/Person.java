package com.lihh.lambda;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.lambda
 * @Author: lihh
 * @CreateTime: 2022-09-08  10:42
 * @Description: TODO
 */
public class Person implements Runnable {
  @Override
  public void run() {
    System.out.println("这是启动一个子线程");
  }
}
