package com.itheima.file;
//文件和文件夹的创建
//对file.listFiles进行链式编程

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("day11\\src\\file\\aaa");
//        createNewFile为创建文件
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        File file1 = new File("day11\\src\\file\\bbb");
//        mkdir为创建单文件夹
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
        File file2 = new File("day11\\src\\file\\aaa\\bbb\\ccc");
//        mkdirs为创建多文件夹
        boolean mkdirs = file2.mkdirs();
        System.out.println(mkdirs);
        File file3 = new File("day11\\src\\file");
//        通过getName之后可以通过lambda对其进行链式编程
        File[] files = file3.listFiles(s -> s.getName().startsWith("龙"));
        for (File file4 : files) {
            System.out.println(file4);
        }
    }
}
