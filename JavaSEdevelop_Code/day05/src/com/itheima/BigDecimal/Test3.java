package com.itheima.BigDecimal;
//BigDecimal对除法中出现无理数的处理方法，用三个参数的除法

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test3 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("3.0");
//报错
/*        BigDecimal divide = bd1.divide(bd2);
        System.out.println(divide);*/
//进一法
/*        BigDecimal divide = bd1.divide(bd2, 2,BigDecimal.ROUND_UP);
        System.out.println(divide);*/
//去尾法
/*        BigDecimal divide = bd1.divide(bd2, 2, BigDecimal.ROUND_FLOOR);
        System.out.println(divide);*/
//四舍五入法
/*        BigDecimal divide = bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide);*/
    }
}
