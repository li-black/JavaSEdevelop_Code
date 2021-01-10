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

class User implements Serializable {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}