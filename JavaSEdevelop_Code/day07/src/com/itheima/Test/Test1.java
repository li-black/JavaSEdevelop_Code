package com.itheima.Test;
//用迭代器和增强for循环分别遍历集合

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student("小皮同学", 23);
        Student stu2 = new Student("小贾同学", 28);
        Student stu3 = new Student("小璐同学", 18);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        Iterator<Student> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Student stu = iterator.next();
            System.out.println(stu);
        }
        System.out.println("--------------------------");
        for (Student student : arrayList) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int age;

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
