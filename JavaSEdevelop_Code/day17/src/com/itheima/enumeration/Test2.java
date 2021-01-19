package com.itheima.enumeration;

//枚举的基本方法
public class Test2 {
    public static void main(String[] args) {
//        获取枚举名称
        String name = Test1.Spring.name();
        System.out.println(name);
//        枚举索引
        int index1 = Test1.Spring.ordinal();
        int index2 = Test1.Summer.ordinal();
        System.out.println(index1);
        System.out.println(index2);
        String string = Test1.Autumn.toString();
        System.out.println(string);
//        返回索引的差值
        int result = Test1.Autumn.compareTo(Test1.Spring);
        System.out.println(result);
//        字符串转换成枚举
        Test1 Autumn = Enum.valueOf(Test1.class, "Autumn");
        System.out.println(Test1.Autumn == Autumn);
//        获取枚举所有的值
        Test1[] values = Test1.values();
        for (Test1 value : values) {
            System.out.println(value);
        }
    }
}
