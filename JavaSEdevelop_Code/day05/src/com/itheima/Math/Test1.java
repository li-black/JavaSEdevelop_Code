package com.itheima.Math;

//运用Math类
public class Test1 {
    public static void main(String[] args) {
        int abs = Math.abs(-10);
        System.out.println(abs);
        double ceil = Math.ceil(10.1);
        System.out.println(ceil);
        double floor = Math.floor(10.8);
        System.out.println(floor);
        long round = Math.round(11.1);
        System.out.println(round);
        long round1 = Math.round(10.8);
        System.out.println(round1);
        int max = Math.max(10, 20);
        System.out.println(max);
        int min = Math.min(10, 20);
        System.out.println(min);
        double pow = Math.pow(5, 5);
        System.out.println(pow);
        double random = Math.random();
//        获取随机数[0,1)
        System.out.println(random);
//        获取一个5位数的随机数*9将其变为无限逼近9的数在+1无限逼近10，最后乘10000变为5位数，最后取整拿出5位数
        System.out.println((int) ((random * 9 + 1) * 10000));
    }
}
