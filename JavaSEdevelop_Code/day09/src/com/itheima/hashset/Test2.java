package com.itheima.hashset;
//重写equals和hashCode方法来使HashSet实现元素的不重复性

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student stu1 = new Student("林青霞", 30);
        Student stu2 = new Student("张曼玉", 35);
        Student stu3 = new Student("王祖贤", 33);
        Student stu4 = new Student("王祖贤", 33);
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        hs.add(stu4);
        for (Student h : hs) {
            System.out.println(h);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}