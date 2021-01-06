package com.itheima.redblacktree;
//通过TreeSet的自然比较来排序
//自然比较减法得负数则放在树的左边，正数放在树的右边，可以通过先后顺序来决定正序或反序

import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        //创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>();
        //创建学生对象
        Student s1 = new Student("jack", 98, 100, 95);
        Student s2 = new Student("rose", 95, 95, 95);
        Student s3 = new Student("sam", 100, 93, 98);
        //把学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getEnglish() + "," + s.getSum());
        }
    }
}
