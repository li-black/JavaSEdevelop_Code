package com.itheima.getbyte;
//通过指定编码表将中文字符串编码转换成byte数组
//或者用相应的编码变对byte数组进行解码转换成中文字符串

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String str = "黄金拂晓";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = new byte[0];
        byte[] bytes3 = new byte[0];
        try {
            bytes2 = str.getBytes("UTF-8");
            System.out.println(Arrays.toString(bytes2));
            bytes3 = str.getBytes("GBK");
            System.out.println(Arrays.toString(bytes3));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String s1 = new String(bytes1);
        System.out.println(s1);
        try {
            String s2 = new String(bytes2, "UTF-8");
            System.out.println(s2);
            String s3 = new String(bytes3, "GBK");
            System.out.println(s3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
