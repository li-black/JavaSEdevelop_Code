package com.itheima.boundedbufferproblem.three;

import java.util.concurrent.ArrayBlockingQueue;

//消费者类
public class Eater extends Thread {
    private ArrayBlockingQueue<String> arrayBlockingQueue;
    private Object obj;

    public Eater(ArrayBlockingQueue<String> arrayBlockingQueue, Object obj) {
        this.arrayBlockingQueue = arrayBlockingQueue;
        this.obj = obj;
    }

    @Override
    public void run() {
//        1，判断桌子上是否有汉堡包。
//        2，如果没有就等待。
//        3，如果有就开吃
//        4，吃完之后，桌子上的汉堡包就没有了
//                叫醒等待的生产者继续生产
//        汉堡包的总数量减一

        //套路:
        //1. while(true)死循环
        //2. synchronized 锁,锁对象要唯一
        //3. 判断,共享数据是否结束. 结束
        //4. 判断,共享数据是否结束. 没有结束
        while (true) {
            synchronized (obj) {
                if (arrayBlockingQueue.size() == 1) {
                    try {
                        String take = arrayBlockingQueue.take();
                        System.out.println("吃" + take);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
