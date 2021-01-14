package com.itheima.boundedbufferproblem.three;
//arrayBlockingQueue阻塞队列队列中默认有线程锁
//但是除了arrayBlockingQueue方法外没有锁

import java.util.concurrent.ArrayBlockingQueue;

//测试类
public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        Object obj = new Object();
        Eater f = new Eater(arrayBlockingQueue, obj);
        Cooker c = new Cooker(arrayBlockingQueue, obj);
        f.start();
        c.start();
    }
}
