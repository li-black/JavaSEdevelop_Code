package com.itheima.reflex;

public class Student {
    public int age;
    public String name;
    private int money = 200;

    private Student(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String show(String name){
        System.out.println("sss");
        return "sss";
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
