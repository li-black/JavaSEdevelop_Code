package com.itheima.file;
//用递归来删除一个多级并且每一级都有文件的文件夹

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("day11\\src\\file\\aaa");
        delet(file);
    }

    private static void delet(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
            } else {
                delet(file1);
            }
        }
        file.delete();
    }
}
