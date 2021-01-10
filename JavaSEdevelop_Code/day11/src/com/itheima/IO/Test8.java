package com.itheima.IO;
//将一张图片12.png从file复制到test文件下
//写入方法4字节缓冲流加数组时间3
//用try-catch-finally捕获IO异常

import java.io.*;

public class Test8 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("day11\\src\\file\\12.png"));
            bos = new BufferedOutputStream(new FileOutputStream("day11\\src\\file\\test\\15.png"));
            byte[] bys = new byte[1024];
            int len;
            while ((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bis) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != bos) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
