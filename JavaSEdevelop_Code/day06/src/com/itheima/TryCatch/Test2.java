package com.itheima.TryCatch;
//trycatch练习通过catch判断输入数据是否有误

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        stu.setName(name);
        while (true) {
            System.out.println("请输入年龄");
            String strage = sc.nextLine();
            try {
                int age = Integer.parseInt(strage);
                stu.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            } catch (AgeOutOfBoundsException e) {
                System.out.println("请输入一个符合范围的年龄");
                continue;
            }
        }
        System.out.println(stu);
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
        if (age >= 18 && age <= 26) {
            this.age = age;
        } else {
            throw new AgeOutOfBoundsException("年龄超出范围");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}