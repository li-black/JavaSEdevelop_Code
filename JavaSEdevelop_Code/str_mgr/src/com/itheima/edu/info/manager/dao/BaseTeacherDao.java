package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public interface BaseTeacherDao {
    public abstract boolean AddTeacher(Teacher tea);

    public abstract void deleteTeacherById(String delId);

    public abstract void updateTeacher(String updateId, Teacher tea);

    public abstract Teacher[] findAllteas();

    public abstract int getindex(String id);
}
