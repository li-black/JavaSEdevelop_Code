package com.itheima.Properties;
//Properties在IO中的读入操作
//getProperty可以获得键值所对应的value

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fr = new FileReader("day12\\src\\file\\prop-db.properties");
        properties.load(fr);
        fr.close();
        String password = properties.getProperty("password");
        System.out.println(password);
        System.out.println(properties);
    }
}
