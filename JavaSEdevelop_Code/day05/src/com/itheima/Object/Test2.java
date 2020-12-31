package com.itheima.Object;
//重写Object中的equals方法

public class Test2 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("张三", 23);
        boolean b = stu1 == stu2;
        System.out.println(b);
        boolean equals = stu1.equals(stu2);
        System.out.println(equals);
    }
}