package com.itheima.Test;
//注解测试类获取注解的name和method并创建name的对象执行name中对象的方法

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(name = "com.itheima.Test.Dog", method = "eat")
public class Test1 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Class<Test1> proClass = Test1.class;
//        获取Pro的对象
        Pro pro = proClass.getAnnotation(Pro.class);
        String name = pro.name();
        String method = pro.method();
        Class clazz = Class.forName(name);
        Dog dog = (Dog) clazz.newInstance();
        Method method1 = clazz.getMethod(method);
        method1.invoke(dog);
    }
}
