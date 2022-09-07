package com.lihh.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect
 * @Author: lihh
 * @CreateTime: 2022-09-07  11:27
 * @Description: TODO
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface MyAction {
  String value() default "test";
}
