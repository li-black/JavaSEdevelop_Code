package com.itheima.reflex;
//利用反射获取得构造方法创建对象

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class clazz = Class.forName("com.itheima.reflex.Student");
//用获取的带参构造创建对象
        Constructor constructor = clazz.getConstructor(int.class, String.class);
        Student student = (Student) constructor.newInstance(23, "zhangsan");
        System.out.println(student);
//用获取的空参构造创建对象
        Constructor constructor1 = clazz.getConstructor();
        Student student1 = (Student) constructor1.newInstance();
        System.out.println(student1);
//用获取的空参和反射自带的方法创建对象
        Student student2 = (Student) clazz.newInstance();
        System.out.println(student2);
//用获取的私有方法创建对象
        Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);
//私有构造要将其临时检查取消传入true
        declaredConstructor.setAccessible(true);
        Student student3 = (Student) declaredConstructor.newInstance(23);
        System.out.println(student3);
    }
}
