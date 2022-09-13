package com.lihh.interfacefn;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.interfacefn
 * @Author: lihh
 * @CreateTime: 2022-09-09  14:55
 * @Description: TODO
 */
public class SupplierTest {
  public static void main(String[] args) {
    show(() -> {
      int[] arr = {2, 1, 30, 50, 35};
      Arrays.sort(arr);
      return arr[arr.length - 1];
    });
  }

  public static void show(Supplier<Integer> supplier) {
    int value = supplier.get();
    System.out.println(value);
  }
}
