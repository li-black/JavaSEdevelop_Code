package com.itheima.serialize;
//将学生对像封装成一个集合对象序列化

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) throws IOException {
        User u1 = new User("张三", 23);
        User u2 = new User("李四", 24);
        User u3 = new User("王五", 25);
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day12\\src\\file\\h.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
