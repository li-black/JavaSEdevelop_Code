package com.itheima.CountDown;
//CountDownLatch的使用

import java.util.concurrent.CountDownLatch;

public class Test1 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Mom mom = new Mom(countDownLatch);
        Child1 child1 = new Child1(countDownLatch);
        child1.setName("小红");
        Child2 child2 = new Child2(countDownLatch);
        child2.setName("小明");
        Child3 child3 = new Child3(countDownLatch);
        child3.setName("小黄");
        mom.start();
        child1.start();
        child2.start();
        child3.start();
    }
}
