package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher[] teas = new Teacher[5];

    static {
        Teacher tea1 = new Teacher("heima001", "张三", "23", "1999-11-11");
        Teacher tea2 = new Teacher("heima002", "李四", "24", "2000-11-11");
        teas[0] = tea1;
        teas[1] = tea2;
    }

    public boolean AddTeacher(Teacher tea) {
        int index = -1;
        for (int i = 0; i < teas.length; i++) {
            if (teas[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            teas[index] = tea;
            return true;
        } else {
            return false;
        }
    }

    public void deleteTeacherById(String delId) {
        int getindex = getindex(delId);
        teas[getindex] = null;
    }

    public void updateTeacher(String updateId, Teacher tea) {
        int getindex = getindex(updateId);
        teas[getindex] = tea;
    }

    public Teacher[] findAllteas() {
        return teas;
    }

    public int getindex(String id) {
        int index = -1;
        for (int i = 0; i < teas.length; i++) {
            Teacher tea = teas[i];
            if (tea != null && tea.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
