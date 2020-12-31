package com.itheima.recursion;

//用递归求1到100的和
public class Test1 {
    public static void main(String[] args) {
        int sum = getsum(100);
        System.out.println(sum);
    }

    private static int getsum(int i) {
        if (i == 1) {
            return i;
        } else
            return i + getsum(i - 1);
    }
}
