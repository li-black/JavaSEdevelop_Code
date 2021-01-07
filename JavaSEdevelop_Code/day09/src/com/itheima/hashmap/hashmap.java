package com.itheima.hashmap;
//用foreach遍历hashmap集合

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<Student, String>();
        Student stu1 = new Student("yi", 12);
        Student stu2 = new Student("er", 13);
        Student stu3 = new Student("san", 12);
        map.put(stu1, "赵敏");
        map.put(stu2, "黄蓉");
        map.put(stu3, "小龙女");
        map.forEach((k, v) -> {
            System.out.println(k + "..." + v);
        });
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}