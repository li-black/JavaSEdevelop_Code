package com.itheima.Runnable;

//使用实现了Runnable接口的类当做参数来创建线程
//可以用匿名内部类的方式传参
//Runnable接口是可以函数式编程的接口所以可以将匿名内部类转换成函数式编程
public class Test1 {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1);
        MyRunnable m2 = new MyRunnable();
        Thread t2 = new Thread(m1);
        t1.start();
        t2.start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("runnable" + i);
            }
        }).start();
    }
}

//实现了Runnable的类
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runnable" + i);
        }
    }
}
