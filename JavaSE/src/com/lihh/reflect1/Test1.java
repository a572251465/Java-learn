package com.lihh.reflect1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect1
 * @Author: lihh
 * @CreateTime: 2022-09-07  12:34
 * @Description: TODO
 */
public class Test1 {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    String path = Math.random() > 0.5 ? "com.lihh.reflect1.AliPay" : "com.lihh.reflect1.WeChatPay";

    Class c = Class.forName(path);
    Object o = c.newInstance();

    Method m = c.getMethod("payOnline");
    m.invoke(o);
  }
}
