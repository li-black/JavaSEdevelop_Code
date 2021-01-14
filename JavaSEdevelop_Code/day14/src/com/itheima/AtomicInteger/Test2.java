package com.itheima.AtomicInteger;
//AtomicInteger原子类使线程安全

import java.util.concurrent.atomic.AtomicInteger;

public class Test2 {
    public static void main(String[] args) {
        Ice ice = new Ice();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(ice);
            thread.start();
        }
    }
}

class Ice implements Runnable {
    AtomicInteger ai = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int i1 = ai.incrementAndGet();
            System.out.println(i1);
        }
    }
}