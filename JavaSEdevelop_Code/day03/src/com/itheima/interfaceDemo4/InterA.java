package com.itheima.interfaceDemo4;
//接口中可以定义专为接口内部调用的私有方法
//私有方法尽量定义成静态的,方便接口内静态方法调用

public interface InterA {
    private static void show() {
        System.out.println("鹅鹅鹅，曲项向天歌");
    }

    default void show1() {
        System.out.println("默认开始");
        show();
        System.out.println("默认结束");
    }

    static void show2() {
        System.out.println("静态开始");
        show();
        System.out.println("静态结束");
    }
}
