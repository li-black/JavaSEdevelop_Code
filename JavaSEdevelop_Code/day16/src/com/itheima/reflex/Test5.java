package com.itheima.reflex;
//利用反射实现对成员变量的get和set方法

import java.lang.reflect.Field;

public class Test5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("com.itheima.reflex.Student");
        Field filed = clazz.getDeclaredField("money");
        //私有的要将其临时检查取消传入true
        filed.setAccessible(true);
//        先创建对象
        Student student = (Student) clazz.newInstance();
//        设置值传入对象与私有变量
        filed.set(student, 2000);
//        获取值传入私有对象
        Object o = filed.get(student);
        System.out.println(o);
//        获取公有变量
        Field name = clazz.getField("name");
//        创建对象
        Student student1 = (Student) clazz.newInstance();
//        获取公有变量的值
        Object o1 = name.get(student1);
        System.out.println(o1);
//        设置公有变量的值
        name.set(student1, "zhangsan");
        System.out.println(student1);
    }
}
