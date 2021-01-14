package com.itheima.CountDown;

import java.util.concurrent.CountDownLatch;

class Mom extends Thread {
    private CountDownLatch countDownLatch;

    public Mom(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("收拾");
    }
}

class Child1 extends Thread {
    private CountDownLatch countDownLatch;

    public Child1(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "吃" + i);
        }
        countDownLatch.countDown();
    }
}

class Child2 extends Thread {
    private CountDownLatch countDownLatch;

    public Child2(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "吃" + i);
        }
        countDownLatch.countDown();
    }
}

class Child3 extends Thread {
    private CountDownLatch countDownLatch;

    public Child3(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "吃" + i);
        }
        countDownLatch.countDown();
    }
}