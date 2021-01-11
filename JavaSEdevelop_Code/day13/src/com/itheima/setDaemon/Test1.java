package com.itheima.setDaemon;

//setDaemon()方法可以将一个线程设置为守护线程，
// 当主线程执行完毕之后，守护线程也会在不久之后结束，
// 即使守护线程没有执行完毕
public class Test1 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        m1.setName("国王");
        MyThread2 m2 = new MyThread2();
        m2.setName("骑士");
        m1.start();
        m2.setDaemon(true);
        m2.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i);
        }
    }
}