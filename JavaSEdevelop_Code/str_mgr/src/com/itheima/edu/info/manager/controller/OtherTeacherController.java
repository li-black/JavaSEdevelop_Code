package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class OtherTeacherController extends BaseTeacherController {
    private Scanner sc = new Scanner(System.in);

    @Override
    public Teacher inputTeacherInfo(String id) {
        System.out.println("请输入老师姓名");
        String name = sc.next();
        System.out.println("请输入老师年龄");
        String age = sc.next();
        System.out.println("请输入老师生日");
        String birthday = sc.next();
        Teacher tea = new Teacher();
        tea.setId(id);
        tea.setName(name);
        tea.setAge(age);
        tea.setBirthday(birthday);
        return tea;
    }
}
