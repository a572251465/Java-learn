package com.lihh.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.file
 * @Author: lihh
 * @CreateTime: 2022-08-31  20:54
 * @Description: TODO
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File f = new File("F:" + File.separator + ".pnpm-debug.log");
        // 用于读写字符流
        FileReader reader = new FileReader(f);

        int res;
        // 如果读取不到的话 就会返回-1
        while ((res = reader.read()) != -1) {
            System.out.println((char)res);
        }

        reader.close();
    }
}
