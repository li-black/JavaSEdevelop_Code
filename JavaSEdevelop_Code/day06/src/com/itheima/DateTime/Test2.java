package com.itheima.DateTime;
//LocalDateTime的format和parse方法

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = now.format(pattern1);
        System.out.println(str);
        String strDate = "2020-11-11 11:11:11";
        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(strDate, pattern2);
        System.out.println(parse);
    }
}
