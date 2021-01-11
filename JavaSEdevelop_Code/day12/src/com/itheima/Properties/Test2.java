package com.itheima.Properties;
//Properties在IO中的写入操作
//store方法可以添加注释

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("username", "zhangsan");
        properties.setProperty("password", "123456");
        properties.setProperty("db", "mysql");
        FileWriter fw = new FileWriter("day12\\src\\file\\prop-db.properties");
        properties.store(fw, "中国");
        fw.close();
        System.out.println(properties);
    }
}
