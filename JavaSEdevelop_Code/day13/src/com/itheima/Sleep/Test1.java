package com.itheima.Sleep;
//Thread.sleep()方法使执行到它的线程进入睡眠一定时间在执行

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(3000);
        Thread t1 = new Thread(new MyRunnable());
        t1.setName("销户");
        t1.start();
    }
}

class MyRunnable extends Thread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}