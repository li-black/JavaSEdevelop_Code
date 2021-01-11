package com.itheima.serialize;
//通过ObjectOutputStream将一个对象序列化成文档格式

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day12\\src\\file\\d.txt"));
        User user = new User("张三", 23);
        oos.writeObject(user);
        oos.close();

    }
}