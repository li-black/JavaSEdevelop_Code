package com.itheima.IO;
//将一张图片12.png从file复制到test文件下
//用try-catch-finally捕获IO异常

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        long start = 0;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            start = System.currentTimeMillis();
            fis = new FileInputStream("day11\\src\\file\\12.png");
            fos = new FileOutputStream("day11\\src\\file\\test\\12.png");
            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);
            }
        } catch (IOException e) {
            System.out.println("系统忙！");
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("关闭错误！");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
