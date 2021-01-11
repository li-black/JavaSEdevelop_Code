package com.itheima.MyThread;

//创造两个线程并执行能够看到两个线程交替执行
public class Test1 {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.start();
        my2.start();
    }
}
