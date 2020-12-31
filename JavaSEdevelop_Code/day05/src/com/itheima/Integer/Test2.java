package com.itheima.Integer;

//jdk1.5之后推出特性自动装箱
//装箱:把一个基本数据类型，变成对应的包装类。
//自动:java底层会自动调用valueof方法
//扩展
//jdk1.5之后推出特性自动拆箱
//装箱:把一个包装类型，变成对应的基本数据类型。
//自动:java底层会自动调用valueof方法
public class Test2 {
    public static void main(String[] args) {
//        装箱
        Integer i1 = 100;
        System.out.println(i1);
//        拆箱
        int i2 = i1;
        System.out.println(i2);

    }
}
