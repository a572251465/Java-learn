package com.lihh.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.file
 * @Author: lihh
 * @CreateTime: 2022-09-01  09:41
 * @Description: TODO
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        File f = new File("F:" + File.separator + ".pnpm-debug.log");
        FileInputStream fs = new FileInputStream(f);

        int len;
//        while ((len = fs.read()) != -1) {
//            System.out.println(len);
//        }
        byte[] by = new byte[4];
        while ((len = fs.read(by)) != -1) {
            System.out.println(by.length + "," + len);
        }

        fs.close();
    }
}
