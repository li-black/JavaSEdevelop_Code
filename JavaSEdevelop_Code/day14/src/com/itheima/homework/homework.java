package com.itheima.homework;

public class homework {
    public static void main(String[] args) {
        Choujiang choujiang = new Choujiang();
        Thread thread1 = new Thread(choujiang, "1hao");
        Thread thread2 = new Thread(choujiang, "2hao");
        thread1.start();
        thread2.start();
    }
}

class Choujiang implements Runnable {
    private int[] arr = new int[]{10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
    private boolean[] arr1 = new boolean[arr.length];
    private int num = arr.length;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num > 0) {
                    int index = (int) (Math.random() * arr.length);
                    if (!arr1[index]) {
                        arr1[index] = true;
                        System.out.println(Thread.currentThread().getName() + arr[index]);
                        num--;
                    }
                } else {
                    break;
                }
            }
        }
    }
}