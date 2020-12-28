package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public abstract class BaseTeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    public final void start() {
        Teacherstart:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
//                    System.out.println("添加");
                    AddTeacher();
                    break;
                case "2":
//                    System.out.println("删除");
                    deleteTeacherById();
                    break;
                case "3":
//                    System.out.println("修改");
                    updateTeacher();
                    break;
                case "4":
//                    System.out.println("查看");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统，再见！");
                    break Teacherstart;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }

    private final void AddTeacher() {
        String id;
        while (true) {
            System.out.println("请输入老师id");
            id = sc.next();
            boolean flag = teacherService.isExists(id);
            if (flag) {
                System.out.println("id已被占用，请重新输入！");
            } else {
                break;
            }
        }
        Teacher tea = inputTeacherInfo(id);
        boolean result = teacherService.AddTeacher(tea);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    private final void deleteTeacherById() {
        Teacher[] teas = teacherService.findAllTeas();
        if (teas == null) {
            System.out.println("查无信息，请添加后再删除！");
            return;
        }
        String delId = inputTeacherId();
        teacherService.deleteTeacherById(delId);
        System.out.println("删除成功！");
    }

    private final void updateTeacher() {
        Teacher[] teas = teacherService.findAllTeas();
        if (teas == null) {
            System.out.println("查无信息，请添加后再修改");
            return;
        }
        String updateId = inputTeacherId();
        Teacher tea = inputTeacherInfo(updateId);
        teacherService.updateTeacher(updateId, tea);
        System.out.println("修改成功！");
    }

    private final void findAllTeacher() {
        Teacher[] allTeas = teacherService.findAllTeas();
        if (allTeas == null) {
            System.out.println("查无信息，请添加后再查询");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < allTeas.length; i++) {
            Teacher tea = allTeas[i];
            if (tea != null) {
                System.out.println(tea.getId() + "\t" + tea.getName() + "\t" + tea.getAge() + "\t\t" + tea.getBirthday());
            }
        }
    }

    public final String inputTeacherId() {
        String id;
        while (true) {
            System.out.println("请输入老师id");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("您输入的id不存在，请重新输入");
            } else {
                break;
            }
        }
        return id;
    }

    public abstract Teacher inputTeacherInfo(String id);
}
