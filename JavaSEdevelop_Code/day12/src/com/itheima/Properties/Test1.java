package com.itheima.Properties;
//Properties的特有方法

import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
//        将键值对存入集合
        properties.setProperty("jiangsu", "nanjing");
        properties.setProperty("anhui", "nanjing");
        properties.setProperty("snandong", "jinan");
        System.out.println(properties);
        System.out.println("==================================");
        String value = properties.getProperty("jiangsu");
//        根据键来查找值
        System.out.println(value);
        System.out.println("===================================");
        Set<String> keys = properties.stringPropertyNames();
//        返回键集合
        for (String key : keys) {
            String val = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
