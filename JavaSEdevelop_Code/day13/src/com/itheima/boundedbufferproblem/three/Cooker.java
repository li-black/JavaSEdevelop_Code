package com.itheima.boundedbufferproblem.three;

import java.util.concurrent.ArrayBlockingQueue;

//厨师类
public class Cooker extends Thread {
    private ArrayBlockingQueue<String> arrayBlockingQueue;
    private Object obj;

    public Cooker(ArrayBlockingQueue<String> arrayBlockingQueue, Object obj) {
        this.arrayBlockingQueue = arrayBlockingQueue;
        this.obj = obj;
    }

    //    生产者步骤：
//            1，判断桌子上是否有汉堡包
//    如果有就等待，如果没有才生产。
//            2，把汉堡包放在桌子上。
//            3，叫醒等待的消费者开吃。
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (arrayBlockingQueue.size() == 0) {
                    try {
                        arrayBlockingQueue.put("汉堡包");
                        System.out.println("厨师放入汉堡包");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
