package com.itheima.edu.info.manager.dao;
//数据处理类

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
    private static ArrayList<Student> stus = new ArrayList<>();

    static {
        Student stu1 = new Student("heima001", "张三", "23", "1999-11-11");
        Student stu2 = new Student("heima002", "李四", "24", "2000-11-11");
        stus.add(stu1);
        stus.add(stu2);
    }

    public boolean Studentadd(Student stu) {
        stus.add(stu);
        return true;
    }

    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        stus.remove(index);
    }

    public void updateStudentById(String updateId, Student stu) {
        int index = getIndex(updateId);
        stus.set(index, stu);
    }

    public Student[] findAllStudent() {
        Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }
        return students;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student student = stus.get(i);
            if (student != null && student.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }
}