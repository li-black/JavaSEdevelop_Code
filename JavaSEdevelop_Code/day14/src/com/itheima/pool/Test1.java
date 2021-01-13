package com.itheima.pool;
//线程池的创建

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "执行了");
            });
//            Thread.sleep(200);
        }
        executorService.shutdown();
    }
}
