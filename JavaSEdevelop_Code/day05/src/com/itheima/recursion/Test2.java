package com.itheima.recursion;

import java.math.BigDecimal;

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
//如果数字太大要用BigDecimal类型来运算
/*
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(100);
        BigDecimal sumL = getjc(bigDecimal);
        System.out.println(sumL);
    }

    private static BigDecimal getjc(BigDecimal bigDecimal) {
        BigDecimal i = BigDecimal.valueOf(1);
        if (bigDecimal.equals(i)) {
            return i;
        } else {
            return bigDecimal.multiply(getjc(bigDecimal.subtract(i)));
        }
    }
*/
