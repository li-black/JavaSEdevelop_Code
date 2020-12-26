package com.itheima.staticDemo.domain;

//学生类测试static关键字
public class Student {
    String name;
    //        在同包内调用static变量时不用加public，不同包中要加public修饰
    public static String school;

    public void show() {
        System.out.println(name + "..." + school);
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }
}
