package com.itheima.reflex;
//用反射获取对象的构造方法

import java.lang.reflect.Constructor;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
//        获取类的Class对象
        Class clazz = Class.forName("com.itheima.reflex.Student");
//        获取public修饰的所有构造方法返回数组
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("==================================");
//        获取所有的构造方法包括私有的返回数组
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("==================================");
//        获取指定参数的public修饰的构造方法（单个）
        Constructor constructor = clazz.getConstructor(int.class, String.class);
        System.out.println(constructor);
        System.out.println("==================================");
//        获取指定参数的构造方法无论是私有的还是公共的（单个）
        Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor);
    }
}
