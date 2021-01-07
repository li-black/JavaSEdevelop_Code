package com.itheima.homework;

import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>((o1, o2) -> {
            int result = o1.getsum() - o2.getsum();
            result = result == 0 ? o1.getChinese() - o2.getChinese() : result;
            result = result == 0 ? o1.getMath() - o2.getMath() : result;
            result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
            return result;
        });
        //创建学生对象
        Student s1 = new Student("jack", 98, 100, 95);
        Student s2 = new Student("rose", 95, 95, 95);
        Student s3 = new Student("sam", 100, 93, 98);
        //把学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student t : ts) {
            System.out.println(t.getName() + t.getsum());
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    public int getsum() {
        int result = chinese + math + english;
        return result;
    }


    @Override
    public int compareTo(Student o) {
        int result = o.getsum() - this.getsum();
        result = result == 0 ? o.getChinese() - this.getChinese() : result;
        result = result == 0 ? o.getMath() - this.getMath() : result;
        result = result == 0 ? o.getName().compareTo(this.getName()) : result;
        return result;
    }
}