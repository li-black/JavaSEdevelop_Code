package com.itheima.reflex;
//用反射调用方法

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("com.itheima.reflex.Student");
        Method show = clazz.getMethod("show", String.class);
        Student student = (Student) clazz.newInstance();
//        用invoke调用方法并接收返回值
        String result = (String) show.invoke(student, "zhangsan");
        System.out.println(result);
    }
}
