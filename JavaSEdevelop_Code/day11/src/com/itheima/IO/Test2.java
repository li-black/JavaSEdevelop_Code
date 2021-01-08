package com.itheima.IO;
//FileOutputStream批量写入
//用try-catch-finally捕获IO异常

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
//            int a = 10 / 0;
            fos = new FileOutputStream("day11\\src\\file\\a.txt", true);
            for (int i = 0; i < 10; i++) {
                fos.write("hello".getBytes());
                fos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            System.out.println("系统忙！");
        } catch (Exception e) {
            System.out.println("数学异常！");
        } finally {
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("关闭错误！");
                }
            }
        }
    }
}
