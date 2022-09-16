package com.lihh.lambda.demo2;

public class RunnableTest {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("通过匿名内部类 实现了Runnable");
            }
        });
        th.start();

        Thread th1 = new Thread(() -> {
            System.out.println("通过lambda表达式 实现了Runnable");
        });
        th1.start();
    }
}
