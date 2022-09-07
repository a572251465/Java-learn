package com.lihh.reflect1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect1
 * @Author: lihh
 * @CreateTime: 2022-09-07  12:28
 * @Description: TODO
 */
public class AliPay implements IPay {
  @Override
  public void payOnline() {
    System.out.println("这是支付宝支付");
  }
}
