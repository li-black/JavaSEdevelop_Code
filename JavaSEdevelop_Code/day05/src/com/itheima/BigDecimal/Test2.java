package com.itheima.BigDecimal;

import java.math.BigDecimal;

//BigDecimal中的四则运算，如果想进行精确运算则需要使用字符串的构造，如果是用double的构造会造成精度的损失
public class Test2 {
    public static void main(String[] args) {
/*        BigDecimal bd1 = new BigDecimal(0.1);
        BigDecimal bd2 = new BigDecimal(0.2);*/
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal add = bd1.add(bd2);
        System.out.println("和" + add);

        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("差" + subtract);

        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("乘" + multiply);

        BigDecimal divide = bd1.divide(bd2);
        System.out.println("差" + divide);
    }
}
