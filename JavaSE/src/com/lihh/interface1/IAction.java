package com.lihh.interface1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interface1
 * @Author: lihh
 * @CreateTime: 2022-09-09  13:39
 * @Description: TODO
 */
public interface IAction {
  public static final String type = "add";

  void run();

  static void hand() {
    System.out.println("这是接口中定义的静态方法");
  }

  default void show() {
    System.out.println("这是default 中的 show方法");
  }
}
