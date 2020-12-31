package com.itheima.Integer;

//Integer的对象的获得
public class Test1 {
    public static void main(String[] args) {
//        已过时
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1);
        System.out.println(i2);
//        现在用的
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        System.out.println(i3);
        System.out.println(i4);
    }
}
