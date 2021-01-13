package com.itheima.pool;
//创建ThreadPoolExecutor线程池传递七个参数
//核心线程满了不会优先去创建新线程而是将阻塞队列填满之后如果还有任务，才会去创建新线程直到最大线程数
//shutdownNow不管阻塞队列或者未完成的任务，直接结束线程池

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                2,
                7,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        for (int i = 1; i < 18; i++) {
            poolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "正在执行");
            });
        }
        poolExecutor.shutdownNow();
    }
}
