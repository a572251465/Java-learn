package com.lihh.reflect1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.reflect1
 * @Author: lihh
 * @CreateTime: 2022-09-07  12:29
 * @Description: TODO
 */
public class Test {
  public static void main(String[] args) {
    // 表示从前端接受的支付方式
    String flag = "";
    if (Math.random() > 0.5) {
      flag = "支付宝";
    } else {
      flag = "微信";
    }

    if ("支付宝".equals(flag)) commonPay(new AliPay());
    if ("微信".equals(flag)) commonPay(new WeChatPay());
  }

  public static void commonPay(IPay pay) {
    pay.payOnline();
  }
}
