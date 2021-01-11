package com.itheima.SetGetname;

//Runnable的实现类无法直接getName要通过Thread.currentThread()静态方法来获取线程名
public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.setName("销户");
        t1.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}