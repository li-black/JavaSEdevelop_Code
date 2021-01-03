package com.itheima.Throws;
//异常处理
//编译时异常必须要抛出运行时异常可以省略

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        method1();
        method2();
    }

    private static void method1() throws NullPointerException {
        int[] arr = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.parse("202006-20 10:10:10");
    }
}
