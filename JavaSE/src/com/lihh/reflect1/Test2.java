package com.lihh.reflect1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect1
 * @Author: lihh
 * @CreateTime: 2022-09-07  13:48
 * @Description: TODO
 */
public class Test2 {
  public static void main(String[] args) {
    // 1. class 的 Class
    Class c1 = AliPay.class;

    // 2. 接口 的 Class
    Class c2 = IPay.class;

    // 3. 数组 的 Class
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6};
    Class c4 = arr1.getClass();
    Class c5 = arr2.getClass();
    System.out.println(c5 == c4); // true

    // 4. 基础数据类型 的 Class
    Class c6 = int.class;

    // 5. void 的 Class
    Class c7 = void.class;

    // 6. 注解 的 Class
    Class c8 = Override.class;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(c7);
  }
}
