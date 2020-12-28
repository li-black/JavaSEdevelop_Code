package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

import java.util.ArrayList;

public class OtherTeacherDao implements BaseTeacherDao {
    private static ArrayList<Teacher> teas = new ArrayList<>();

    static {
        Teacher tea1 = new Teacher("heima001", "张三", "23", "1999-11-11");
        Teacher tea2 = new Teacher("heima002", "李四", "24", "2000-11-11");
        teas.add(tea1);
        teas.add(tea2);
    }

    public boolean AddTeacher(Teacher tea) {
        teas.add(tea);
        return true;
    }

    public void deleteTeacherById(String delId) {
        int getindex = getindex(delId);
        teas.remove(getindex);
    }

    public void updateTeacher(String updateId, Teacher tea) {
        int getindex = getindex(updateId);
        teas.set(getindex, tea);
    }

    public Teacher[] findAllteas() {
        Teacher[] teachers = new Teacher[teas.size()];
        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = teas.get(i);
        }
        return teachers;
    }

    public int getindex(String id) {
        int index = -1;
        for (int i = 0; i < teas.size(); i++) {
            Teacher tea = teas.get(i);
            if (tea != null && tea.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
