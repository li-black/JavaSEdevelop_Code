package com.itheima.IO;
//FileInputStream读取多个字节
//用try-catch-finally捕获IO异常

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("day11\\src\\file\\a.txt");
            int by;
            while ((by = inputStream.read()) != -1) {
                System.out.println((char) by);
            }
        } catch (IOException e) {
            System.out.println("系统忙");
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.out.println("关闭错误！");
            }
        }
    }
}
