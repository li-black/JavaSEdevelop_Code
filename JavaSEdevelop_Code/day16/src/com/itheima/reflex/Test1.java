package com.itheima.reflex;

//获取Class对象的三种方法
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
//        调用静态方法
        Class clazz = Class.forName("com.itheima.reflex.Student");
        System.out.println(clazz);
//        通过class属性
        Class clazz1 = Student.class;
        System.out.println(clazz1);
//        利用对象的getClass方法来获取
        Student s = new Student();
        Class aClass = s.getClass();
        System.out.println(aClass);
    }
}
