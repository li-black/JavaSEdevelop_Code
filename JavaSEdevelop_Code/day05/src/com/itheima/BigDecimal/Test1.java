package com.itheima.BigDecimal;
//BigDecimal的构造

import java.math.BigDecimal;

public class Test1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal(10.0);
        BigDecimal bigDecimal2 = new BigDecimal("0.5");
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
    }
}
