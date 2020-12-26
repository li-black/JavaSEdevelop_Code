package com.itheima.extendsDemo3.domain;

public class Zi extends Fu {
    @Override
    public void smallCall() {
        super.smallCall();
        System.out.println("说中文");
    }
}
