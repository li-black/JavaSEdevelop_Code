package com.itheima.edu.info.manager.dao;
//数据处理类

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public interface BaseStudentDao {
    public abstract boolean Studentadd(Student stu);

    public abstract void deleteStudentById(String delId);

    public abstract void updateStudentById(String updateId, Student stu);

    public abstract Student[] findAllStudent();

    public abstract int getIndex(String id);
}