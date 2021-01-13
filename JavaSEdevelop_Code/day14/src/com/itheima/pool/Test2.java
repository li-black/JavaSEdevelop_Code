package com.itheima.pool;
//创建有指定最大容量的线程池

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 15; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "在执行了");
            });
        }
        executorService.shutdown();
    }
}
