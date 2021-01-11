package com.itheima.serialize;
//将序列化之后的集合对象反序列化然后输出
//这种方式比较好

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("day12\\src\\file\\h.txt"));
        ArrayList<User> list = (ArrayList<User>) oos.readObject();
        for (User user : list) {
            System.out.println(user);
        }
        oos.close();
    }
}
