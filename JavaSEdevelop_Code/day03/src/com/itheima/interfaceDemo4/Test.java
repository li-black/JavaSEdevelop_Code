package com.itheima.interfaceDemo4;

//show1和show2就是用接口中的默认方法来实现的
//接口中静态方法只能用接口名调用
public class Test {
    public static void main(String[] args) {
        InterAImpl interA = new InterAImpl();
        interA.show1();
        System.out.println("----------");
        InterA.show2();
    }
}
