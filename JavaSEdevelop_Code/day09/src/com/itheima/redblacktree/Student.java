package com.itheima.redblacktree;

//Student类实现了Comparable接口重写了compareTo方法
public class Student implements Comparable<Student> {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return this.chinese + this.math + this.english;
    }

    @Override
    public int compareTo(Student o) {
        // 主要条件: 按照总分进行排序
        int result = o.getSum() - this.getSum();
        // 次要条件: 如果总分一样,就按照语文成绩排序
        result = result == 0 ? o.getChinese() - this.getChinese() : result;
        // 如果语文成绩也一样,就按照数学成绩排序
        result = result == 0 ? o.getMath() - this.getMath() : result;
        // 如果总分一样,各科成绩也都一样,就按照姓名排序
        result = result == 0 ? o.getName().compareTo(this.getName()) : result;
        return result;
    }
}
