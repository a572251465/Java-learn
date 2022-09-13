package com.lihh.interfacefn;

import java.util.function.Function;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interfacefn
 * @Author: lihh
 * @CreateTime: 2022-09-09  15:43
 * @Description: TODO
 */
public class FunctionTest {
  public static void main(String[] args) {
    show((item) -> {
      return item + "";
    });
  }

  public static void show(Function<Integer, String> f) {
    String a = f.apply(10);
    System.out.println(a);
  }
}
