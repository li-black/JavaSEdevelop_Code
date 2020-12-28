package com.itheima.interfaceDemo3;
//接口中静态方法只能用接口名调用，不能通过实现类名或者对象名调用

public class Test01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
//        test01.show
//        Test01.show
        interfaceStatic.show();
    }
}
