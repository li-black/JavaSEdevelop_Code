package com.itheima.MyCallable;
//实现了Callable的类

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("钓鱼ing" + i);
        }
        return "大鱼上钩";
    }
}
