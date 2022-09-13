package com.lihh.interfacefn;

import java.util.function.Predicate;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interfacefn
 * @Author: lihh
 * @CreateTime: 2022-09-09  15:48
 * @Description: TODO
 */
public class PredicateTest {
  public static void main(String[] args) {
    show((value) -> {
      return value == "";
    });
  }

  public static void show(Predicate<String> predicate) {
    boolean flag = predicate.test("1");
    System.out.println(flag);
  }
}
