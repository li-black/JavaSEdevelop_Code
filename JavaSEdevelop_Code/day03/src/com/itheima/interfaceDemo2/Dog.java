package com.itheima.interfaceDemo2;
//重写接口中的默认方法

public class Dog implements IA {
    @Override
    public void eat() {

    }

    @Override
    public void catchhome() {
        System.out.println("狗看家");
    }
}
