package com.lihh.lambda1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.lambda1
 * @Author: lihh
 * @CreateTime: 2022-09-08  21:30
 * @Description: TODO
 */
public class Test {
  public static void main(String[] args) {
    goShow(new IMyAction() {
      @Override
      public void show() {
        System.out.println("这是一个匿名的内部类");
      }
    });
  }

  public static void goShow(IMyAction my) {
    my.show();
  }
}
