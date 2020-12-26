package com.itheima.edu.info.manager.dao;
//数据处理类

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    private static Student[] stus = new Student[5];

    static {
        Student stu1 = new Student("heima001", "张三", "23", "1999-11-11");
        Student stu2 = new Student("heima002", "李四", "24", "2000-11-11");
        stus[0] = stu1;
        stus[1] = stu2;
    }

    public boolean Studentadd(Student stu) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            stus[index] = stu;
            return true;
        }
    }

    public void deleteStudentById(String delId) {
        int index = getIndex(stus, delId);
        stus[index] = null;
    }

    public void updateStudentById(String updateId, Student stu) {
        int index = getIndex(stus, updateId);
        stus[index] = stu;
    }

    public Student[] findAllStudent() {
        return stus;
    }

    public int getIndex(Student[] stus, String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }
}