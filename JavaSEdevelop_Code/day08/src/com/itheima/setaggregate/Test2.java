package com.itheima.setaggregate;
//用实现Comparable接口的方式来进行compareTo比较

import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student stu1 = new Student("zhangsan", 28);
        Student stu2 = new Student("lisi", 27);
        Student stu3 = new Student("wangwu", 29);
        Student stu4 = new Student("zhaoliu", 28);
        Student stu5 = new Student("qianqi", 30);
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        treeSet.add(stu5);
        for (Student student : treeSet) {
            System.out.println(student);
        }
        System.out.println(treeSet);
    }
}

class Student implements Comparable<Student> {
    public String name;
    public int age;

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
        int result = this.age - o.age;
        return result = result == 0 ? this.name.compareTo(o.name) : result;
    }
}
