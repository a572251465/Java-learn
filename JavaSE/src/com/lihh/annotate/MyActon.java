package com.lihh.annotate;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.annotate
 * @Author: lihh
 * @CreateTime: 2022-09-06  13:42
 * @Description: TODO
 */
public @interface MyActon {
  String value() default "abc";
}
