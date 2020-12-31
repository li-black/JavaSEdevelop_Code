package com.itheima.recursion;

//用递归实现阶乘
public class Test2 {
    public static void main(String[] args) {
        int sum = getjc(5);
        System.out.println(sum);
    }

    private static int getjc(int i) {
        if (i == 1) {
            return i;
        } else {
            return i * getjc(i - 1);
        }
    }
}
