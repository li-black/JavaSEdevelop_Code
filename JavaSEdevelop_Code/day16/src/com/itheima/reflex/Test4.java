package com.itheima.reflex;
//用反射获取对象的成员变量

import java.lang.reflect.Field;

public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("com.itheima.reflex.Student");
//        获取公有的成员变量数组
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
//        获取公有的成员变量（单个）
        Field field = clazz.getField("name");
        System.out.println(field);
//        获取私有的成员变量数组
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
//        获取私有的成员变量（单个）
        Field money = clazz.getDeclaredField("money");
        System.out.println(money);
    }
}
