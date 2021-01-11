package com.itheima.Priority;
//通过setPriority来更改线程的优先级，使得对CPU的抢占相对来说比较高
//但不是绝对会抢占到

import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) {
        MyCallable mc1 = new MyCallable();
        FutureTask ft1 = new FutureTask(mc1);
        Thread t1 = new Thread(ft1);
        t1.setName("飞机");
        t1.setPriority(10);
        t1.start();
        MyCallable mc2 = new MyCallable();
        FutureTask ft2 = new FutureTask(mc2);
        Thread t2 = new Thread(ft2);
        t2.setName("坦克");
        t2.setPriority(5);
        t2.start();
    }
}
