package com.itheima.file;
//File的基本方法使用

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("day11\\src\\file\\a.txt");
        boolean newFile = f.createNewFile();
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        File f1 = new File("day11\\src\\file\\bbb");
        boolean mkdir = f1.mkdir();
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
    }
}
