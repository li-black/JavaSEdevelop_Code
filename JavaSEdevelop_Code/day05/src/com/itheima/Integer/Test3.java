package com.itheima.Integer;

//将字符串类型的整数变成int类型的整数,或者将int类型变成字符串
public class Test3 {
    public static void main(String[] args) {
//        字符串整数变为int
        String s1 = "100";
        int i1 = 200;
        System.out.println(s1 + i1);
        int i2 = Integer.parseInt(s1);
        System.out.println(i2 + i1);
//        int类型的整数变为字符串
//        方式一用字符串的拼接将其转换为字符串
        int i3 = 100;
        String s2 = i3 + "";
        System.out.println(s2 instanceof String);
//        方式二可以调用String类中的valueof方法
        String s3 = String.valueOf(i3);
        System.out.println(s3 instanceof String);
    }
}
