package com.lihh.file;

import java.io.File;
import java.io.IOException;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.file
 * @Author: lihh
 * @CreateTime: 2022-08-31  16:23
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File  f = new File("F:" + File.separator + ".pnpm-debug.log");
        System.out.println("是否可读：" + f.canRead());
        System.out.println("是否可写：" + f.canWrite());
        System.out.println("文件是否存在：" + f.exists());
        System.out.println("文件绝对路径：" + f.getAbsolutePath());
        System.out.println("文件名称：" + f.getName());
        System.out.println("父类地址：" + f.getParent());
        System.out.println("是否文件夹：" + f.isDirectory());
        System.out.println("是否文件：" + f.isFile());
        System.out.println("是否隐藏文件：" + f.isHidden());

        // 判断文件是否存在 如果存在直接删除 反之就是创建新的文件
        if (f.exists()) {
            f.delete();
        } else {
            f.createNewFile();
        }
    }
}
