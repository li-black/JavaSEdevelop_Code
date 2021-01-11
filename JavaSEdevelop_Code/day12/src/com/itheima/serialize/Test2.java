package com.itheima.serialize;
//将序列化后的文档反序列化为对象并输出

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("day12\\src\\file\\d.txt"));
        User user = (User) oos.readObject();
        oos.close();
        System.out.println(user);
    }
}
