package com.itheima.ClassLoader;

//获取三种类加载器
public class Test1 {
    public static void main(String[] args) {
//        系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        平台类加载器
        ClassLoader platformClassLoader = classLoader.getParent();
//        启动类加载器，默认打印为null
        ClassLoader bootstrapClassLoader = platformClassLoader.getParent();
    }
}
