package com.lihh.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.file
 * @Author: lihh
 * @CreateTime: 2022-08-31  22:04
 * @Description: TODO
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        File input = new File("F:" + File.separator + ".pnpm-debug.log");
        File output = new File("F:" + File.separator + ".pnpm-debug1.log");

        FileReader r = new FileReader(input);
        FileWriter w = new FileWriter(output);

        char[] ch = new char[5];
        int len;
        while ((len = r.read(ch)) != -1) {
            // 方式1
//            w.write(ch, 0, len);

            // 方式2
            String s = new String(ch, 0, len);
            w.write(s);
        }

        w.close();
        r.close();
    }
}
