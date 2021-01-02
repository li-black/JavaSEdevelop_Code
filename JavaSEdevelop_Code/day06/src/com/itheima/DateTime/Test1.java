package com.itheima.DateTime;
//创建LocalDateTime对象

import java.time.LocalDateTime;

public class Test1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 11, 11, 11);
        System.out.println(localDateTime);
    }
}
