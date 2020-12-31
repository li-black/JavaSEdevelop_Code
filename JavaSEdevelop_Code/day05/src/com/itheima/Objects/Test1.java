package com.itheima.Objects;
//Objects中的4个方法

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student("小罗同学", 23);
        String string1 = Objects.toString(stu1);
        System.out.println(string1);


        Student stu2 = new Student("小花同学", 26);
        String string2 = Objects.toString(stu2, "随便写一个");
        System.out.println(string2);


        Student stu3 = new Student();
        String string3 = Objects.toString(stu3, "随便写一个");
        System.out.println(string3);


        Student stu4 = null;
        String string4 = Objects.toString(stu4, "随便写一个");
        System.out.println(string4);


        Student stu5 = null;
        boolean aNull = Objects.isNull(stu5);
        System.out.println(aNull);


        Student stu6 = null;
        boolean b = Objects.nonNull(stu6);
        System.out.println(b);
    }
}

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}