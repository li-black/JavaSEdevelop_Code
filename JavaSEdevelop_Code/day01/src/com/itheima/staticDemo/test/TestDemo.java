package com.itheima.staticDemo.test;
//static测试类

import com.itheima.staticDemo.domain.Student;
import com.itheima.staticDemo.domain.Teacher;

public class TestDemo {
    public static void main(String[] args) {
        Student.school = "heima";
        Student stu = new Student();
        stu.setName("zhangsan");
        stu.show();
//        在同包内调用static变量时不用加public，不同包中要加public修饰
//        Teacher.school
    }
}
