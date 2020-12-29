package com.itheima.MyTest5;

import java.util.Random;

//无参有返回值
public class MyTest2 {
    public static void main(String[] args) {
        userRandom(new RandomNunber() {
            @Override
            public int getNumber() {
                Random r = new Random();
                int num = r.nextInt(10) + 1;
                return num;
            }
        });
        userRandom(() -> {
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            return num;
        });
    }

    public static void userRandom(RandomNunber randomNunber) {
        int result = randomNunber.getNumber();
        System.out.println(result);
    }
}

interface RandomNunber {
    int getNumber();
}