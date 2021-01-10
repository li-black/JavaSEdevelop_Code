package com.itheima.IO;
//将一张图片12.png从file复制到test文件下
//写入方法3字节缓冲流时间17
//用try-catch-finally捕获IO异常

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("day11\\src\\file\\12.png"));
            bos = new BufferedOutputStream(new FileOutputStream("day11\\src\\file\\test\\14.png"));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            System.out.println("异常");
        } finally {
            if (null != bis) {
                try {
                    bis.close();
                } catch (IOException e) {
                    System.out.println("异常");
                }
            }
            if (null != bos) {
                try {
                    bos.close();
                } catch (IOException e) {
                    System.out.println("异常");
                }
            }
        }
        System.out.println("完成");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
