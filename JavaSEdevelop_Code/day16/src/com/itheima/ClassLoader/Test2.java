package com.itheima.ClassLoader;
//通过类加载器和Properties来读取配置文件
//getResourceAsStream返回读取文件之后的IO流

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        Properties properties = new Properties();
        properties.load(is);
        String property1 = properties.getProperty("name");
        String property2 = properties.getProperty("age");
        System.out.println(property1);
        System.out.println(property2);
        System.out.println(properties);
        is.close();
    }
}
