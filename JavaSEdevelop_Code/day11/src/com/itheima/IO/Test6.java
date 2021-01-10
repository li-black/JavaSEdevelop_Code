package com.itheima.IO;
//将一张图片12.png从file复制到test文件下
//写入方法2字节流加数组时间8
//用try-catch-finally捕获IO异常

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //根据数据源创建字节输入流对象
            fis = new FileInputStream("day11\\src\\file\\12.png");
            //根据目的地创建字节输出流对象
            fos = new FileOutputStream("day11\\src\\file\\test\\13.png");

            //读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
            byte[] bys = new byte[1024];
            int len;
            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
