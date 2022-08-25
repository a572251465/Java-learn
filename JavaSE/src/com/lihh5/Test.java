package com.lihh5;

/**
 * @Author lihh
 * @Date 2022/8/25 - 08 - 25
 * @Description: Java-learn
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        Girl g = new Girl();
        Animal an = d;
        g.play(an);

        Animal an1 = c;
        g.play(an1);
    }
}
