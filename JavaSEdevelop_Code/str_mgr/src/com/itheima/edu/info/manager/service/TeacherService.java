package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean AddTeacher(Teacher tea) {
        return teacherDao.AddTeacher(tea);
    }

    public void deleteTeacherById(String delId) {
        teacherDao.deleteTeacherById(delId);
    }

    public void updateTeacher(String updateId, Teacher tea) {
        teacherDao.updateTeacher(updateId, tea);
    }

    public Teacher[] findAllTeas() {
        Teacher[] allteas = teacherDao.findAllteas();
        boolean flag = false;
        for (int i = 0; i < allteas.length; i++) {
            Teacher tea = allteas[i];
            if (tea != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allteas;
        } else {
            return null;
        }
    }

    public boolean isExists(String id) {
        Teacher[] teas = teacherDao.findAllteas();
        boolean exists = false;
        for (int i = 0; i < teas.length; i++) {
            Teacher tea = teas[i];
            if (tea != null && tea.getId().equals(id)) {
                exists = true;
            }
        }
        return exists;
    }
}
