package com.itheima.serialize;
//serialVersionUID相当于对其添加了一个版本号
//transient表示不想将这个成员变量序列化

import java.io.Serializable;

class User implements Serializable {
    private static final long serialVersionUID = -8034413495449437009L;
    private String name;
    private transient int age;
    private String day;

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