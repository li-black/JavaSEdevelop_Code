package com.itheima.TryCatch;
//trycatch捕获异常

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            format();
        } catch (ParseException e) {
            System.out.println("格式错误");
        }
        System.out.println("end");
    }

    private static void format() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月");
        sdf.parse("2010-11");
    }
}
