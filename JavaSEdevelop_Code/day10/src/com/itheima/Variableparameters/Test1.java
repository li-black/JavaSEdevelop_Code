package com.itheima.Variableparameters;

//可变参数的使用，只能有一个，只能放在最后面
public class Test1 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }
}
