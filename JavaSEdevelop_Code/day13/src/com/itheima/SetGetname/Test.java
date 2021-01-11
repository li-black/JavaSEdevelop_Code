package com.itheima.SetGetname;

//用setName给线程起名或者通过调用Thread的构造方法给线程起名
//适用于继承Thread
public class Test {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("小明");
        m1.start();
        MyThread m2 = new MyThread();
        m2.setName("小花");
        m2.start();
    }
}

class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("钓鱼" + i);
        }
    }
}