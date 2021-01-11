package com.itheima.MyCallable;
//用实现了Callable的接口类来作为参数创建FutureTask任务
//用FutureTask任务作为参数创建Thread线程
//FutureTask中有get方法获取Callable创建的线程的返回值

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable m1 = new MyCallable();
        FutureTask<String> f1 = new FutureTask<>(m1);
        Thread t1 = new Thread(f1);
        t1.start();
        String s = f1.get();
        System.out.println(s);
    }
}
