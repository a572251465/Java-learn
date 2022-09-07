package com.lihh.file;

import java.io.File;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.file
 * @Author: lihh
 * @CreateTime: 2022-08-31  17:10
 * @Description: TODO
 */
public class Test01 {
    public static void main(String[] args) {
        File f = new File("F:" + File.separator + "my-project" + File.separator);

        System.out.println("是否文件夹:" + f.isDirectory());
        String[] lists = f.list();
        for (String file: lists) {
            System.out.println(file);
        }

        System.out.println("--------------------------------------------------------");

        File[] files = f.listFiles(File::isDirectory);
        for (File file: files) {
            System.out.println(file.getName());
        }
    }
}
