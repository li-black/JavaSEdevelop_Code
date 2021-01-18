package com.itheima.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Test1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        try {
            int result = Integer.parseInt(number);
            LOGGER.info("类型转换成功" + result);
//            System.out.println("转换成功");
        } catch (NumberFormatException e) {
            LOGGER.error("类型转换失败");
//            System.out.println("转换失败");
        }
    }
}
