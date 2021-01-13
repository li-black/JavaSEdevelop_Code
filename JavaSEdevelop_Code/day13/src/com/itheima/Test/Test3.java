package com.itheima.Test;
//Lock锁ReentrantLock()的使用
//解锁一定要执行建议放在finally语句中

import java.util.concurrent.locks.ReentrantLock;

//买票案例加锁之后
public class Test3 {
    public static void main(String[] args) {
        Runnable runnable = new Sellss();
        Thread t1 = new Thread(runnable, "1号");
        Thread t2 = new Thread(runnable, "2号");
        Thread t3 = new Thread(runnable, "3号");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Sellss implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets <= 0) {
                    break;
                } else {
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "剩余" + tickets);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}