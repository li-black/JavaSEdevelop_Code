package com.itheima.volatile1;

//线程内部也有内存区
//volatile关键字能够让线程每次执行都查看共享变量的值
public class Test1 {
    public static void main(String[] args) {
        girl girl = new girl();
        boy boy = new boy();
        girl.start();
        boy.start();
    }
}

class money {
    public static volatile int money = 10000;
}

class girl extends Thread {
    @Override
    public void run() {
        lo:
        while (true) {
            while (money.money != 10000) {
                System.out.println("bian");
                break lo;
            }
        }
    }
}

class boy extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        money.money = 90000;
    }
}

