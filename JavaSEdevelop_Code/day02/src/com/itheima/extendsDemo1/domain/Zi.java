package com.itheima.extendsDemo1.domain;

public class Zi extends Fu {
    int a = 20;

    public void show() {
        int a = 30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
