package com.itheima.Test;

//买票案例加锁之后
public class Test1 {
    public static void main(String[] args) {
        Runnable runnable = new Sell();
        Thread t1 = new Thread(runnable, "1号");
        Thread t2 = new Thread(runnable, "2号");
        Thread t3 = new Thread(runnable, "3号");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Sell implements Runnable {
    private int tickets = 100;
    Object lock = new Object();

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