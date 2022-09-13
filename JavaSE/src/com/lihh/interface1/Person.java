package com.lihh.interface1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interface1
 * @Author: lihh
 * @CreateTime: 2022-09-09  13:31
 * @Description: TODO
 */
public class Person implements IInterface {
  @Override
  public void run() {
    System.out.println("这是实现的方法");
  }
}
