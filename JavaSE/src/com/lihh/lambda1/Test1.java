package com.lihh.lambda1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.lambda1
 * @Author: lihh
 * @CreateTime: 2022-09-08  21:44
 * @Description: TODO
 */
public class Test1 {
  public static void main(String[] args) {
    goShow(() -> {
      System.out.println("这是一个lambda表达式");
    });
  }

  public static void goShow(IMyAction my) {
    my.show();
  }
}
