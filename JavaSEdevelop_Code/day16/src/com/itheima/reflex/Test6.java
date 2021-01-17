package com.itheima.reflex;
//利用反射获取方法

import java.lang.reflect.Method;

public class Test6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("java.lang.Object");
//        获取公有方法返回数组
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("===========================================");
//        获取私有方法返回数组
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("===========================================");
        //        获取公有单个方法
        Method toString = clazz.getMethod("toString");
        System.out.println(toString);
        System.out.println("===========================================");
        //        获取私有单个方法
        Method finalize = clazz.getDeclaredMethod("finalize");
        System.out.println(finalize);
        System.out.println("===========================================");
        //        获取公有有参数的单个方法
        Method equals = clazz.getMethod("equals", Object.class);
        System.out.println(equals);
    }
}
