package com.itheima.System;
//计算循环100000次所需要的时间

public class Test1 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
