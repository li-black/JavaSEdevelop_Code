package com.itheima.treemap;
//treemap的基本使用
// 重写比较器，或者创建匿名内部类，或者用表达式方法实现比较

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>((o1, o2) -> {
            int result = o2.getAge() - o1.getAge();
            result = result == 0 ? o2.getName().compareTo(o1.getName()) : result;
            return result;
        }
                /*new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        }*/);
        Student s1 = new Student("aa", 23);
        Student s2 = new Student("bb", 22);
        Student s3 = new Student("cc", 23);
        treeMap.put(s1, "jiangsu");
        treeMap.put(s2, "beijing");
        treeMap.put(s3, "hainan");
        treeMap.forEach((k, v) -> {
            System.out.println(k + "..." + v);
        });
    }
}

class Student implements Comparable<Student> {
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
    public int compareTo(Student o) {
        int result = o.age - this.age;
        result = result == 0 ? o.name.compareTo(this.name) : result;
        return result;
    }
}