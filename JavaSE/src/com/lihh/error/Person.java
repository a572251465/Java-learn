package com.lihh.error;

/**
 * @Author lihh
 * @Date 2022/8/26 - 08 - 26
 * @Description: Java-learn
 * @version: 1.0
 */
public class Person {
    private String name;
    private int age;
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) throws Exception {
        if (sex != '男' && sex != '女') {
//            throw new RuntimeException("您输入的性别不合适");
            throw new Exception("您输入的性别不合适");
        }

        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
