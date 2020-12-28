package com.itheima.edu.info.manager.service;
//服务类

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.factory.StudentDaoFactory;

public class StudentService {
    private BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();

    public boolean Studentadd(Student stu) {
        return studentDao.Studentadd(stu);
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updateStudentById(String updateId, Student stu) {
        studentDao.updateStudentById(updateId, stu);
    }

    public Student[] findAllStudent() {
        Student[] allStudent = studentDao.findAllStudent();
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student student = allStudent[i];
            if (student != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allStudent;
        } else {
            return null;
        }
    }

    public boolean isExists(String id) {
        Student[] stus = studentDao.findAllStudent();
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)) {
                exists = true;
            }
        }
        return exists;
    }
}
