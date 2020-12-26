package com.itheima.edu.info.manager.controller;
//客服接待类

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    //    学生管理系统开始的方法
    public final void start() {
        Studentstart:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case ("1"):
//                    System.out.println("添加");
                    Studentadd();
                    break;
                case ("2"):
//                    System.out.println("删除");
                    deleteStudentById();
                    break;
                case ("3"):
//                    System.out.println("修改");
                    updateStudentById();
                    break;
                case ("4"):
//                    System.out.println("查询");
                    findAllStudent();
                    break;
                case ("5"):
                    System.out.println("感谢您使用学生管理系统，再见！");
                    break Studentstart;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }

    public final void Studentadd() {
        String id;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已被占用");
            } else {
                break;
            }
        }
        Student stu = inputStudentInfo(id);
        boolean result = studentService.Studentadd(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public final void deleteStudentById() {
        Student[] stus = studentService.findAllStudent();
        if (stus == null) {
            System.out.println("查无信息，请添加后再删除");
            return;
        }
        String delId = inputStudentId();
        studentService.deleteStudentById(delId);
        System.out.println("删除成功！");
    }

    public final void updateStudentById() {
        Student[] stus = studentService.findAllStudent();
        if (stus == null) {
            System.out.println("查无信息，请添加信息后再来修改");
            return;
        }
        String updateId = inputStudentId();
        Student stu = inputStudentInfo(updateId);
        studentService.updateStudentById(updateId, stu);
        System.out.println("修改成功!");
    }

    public final void findAllStudent() {
        Student[] stus = studentService.findAllStudent();
        if (stus == null) {
            System.out.println("查无信息，请添加后再查询");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null) {
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t\t" + student.getBirthday());
            }
        }
    }

    public final String inputStudentId() {
        String id;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("您输入的id不存在，请重新输入。");
            } else {
                break;
            }
        }
        return id;
    }

    public abstract Student inputStudentInfo(String id);
}