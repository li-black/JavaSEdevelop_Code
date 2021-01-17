package com.itheima.Test;
//根据读取的配置文件根据反射来启动方法而无需修改代码

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
//        获取系统类加载器
        ClassLoader classLoader = Test1.class.getClassLoader();
//        加载文件
        InputStream resourceAsStream = classLoader.getResourceAsStream("prop1.properties");
        properties.load(resourceAsStream);
        System.out.println(properties);
//        读取出className和methodName
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
//        反射获取方法并且创建对象和执行方法
        Class clazz = Class.forName(className);
        Method method = clazz.getMethod(methodName);
        Dog dog = (Dog) clazz.getConstructor().newInstance();
        method.invoke(dog);
    }
}
