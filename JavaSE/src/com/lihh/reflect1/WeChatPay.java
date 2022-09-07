package com.lihh.reflect1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect1
 * @Author: lihh
 * @CreateTime: 2022-09-07  12:29
 * @Description: TODO
 */
public class WeChatPay implements IPay {
  @Override
  public void payOnline() {
    System.out.println("这是微信支付");
  }
}
