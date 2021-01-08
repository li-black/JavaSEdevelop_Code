package com.itheima.IO;
//FileInputStream读取文件只能读取一个字节
//用try-catch-finally捕获IO异常

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("day11\\src\\file\\a.txt");
            int read = inputStream.read();
            System.out.println((char) read);
        } catch (IOException e) {
            System.out.println("系统忙！");
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("关闭错误！");
                }
            }
        }
    }
}
