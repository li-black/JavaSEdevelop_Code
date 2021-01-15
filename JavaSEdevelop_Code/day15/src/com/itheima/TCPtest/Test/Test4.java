package com.itheima.TCPtest.Test;
//服务端接收图片
//接收成功后返回上传成功
//优化1用while循环包裹能够多次上传
//优化2使用UUID.randomUUID()动态生成图片名解决了每次图片名一致造成覆盖的现象
//优化3用多线程方式执行
//优化4使用线程池

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while (true) {
            Socket accept = ss.accept();
            Runnablesocket runnablesocket = new Runnablesocket(accept);
//            new Thread(runnablesocket).start();
            pool.submit(runnablesocket);
        }
//        ss.close();
    }
}
