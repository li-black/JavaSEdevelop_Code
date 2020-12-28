package com.itheima.interfaceDemo2;

//接口中可以定义带有方法体的默认方法
public interface IA {
    void eat();

    default void catchhome() {
        System.out.println("看家");
    }
}
