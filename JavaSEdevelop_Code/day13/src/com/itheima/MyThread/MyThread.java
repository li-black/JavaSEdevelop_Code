package com.itheima.MyThread;

//继承Thread的类
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程启动" + i);
        }
    }
}
