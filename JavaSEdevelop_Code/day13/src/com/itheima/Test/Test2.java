package com.itheima.Test;

//new多个线程需要锁对象唯一，要用static关键字修饰共享变量与锁
//买票案例
public class Test2 {
    public static void main(String[] args) {
        Sells sells1 = new Sells();
        Sells sells2 = new Sells();
        sells1.setName("1");
        sells2.setName("2");
        sells1.start();
        sells2.start();
    }
}

class Sells extends Thread {
    private static int tickets = 100;
    private static Object lock = new Object();

    @Override
    public void run() {
        while (true) synchronized (lock) {
            if (tickets <= 0) {
                break;
            } else {
                tickets--;
                System.out.println(Thread.currentThread().getName() + "剩余" + tickets);
            }
        }
    }
}