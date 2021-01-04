package com.itheima.setaggregate;
//用比较器的方式来进行compareTo比较如果两个方法都有那么比较器优先

import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        TreeSet<Teacher> treeSet = new TreeSet<>((o1, o2) -> {
//            o1为要存入的元素
//            o2为已经存入的元素
            int result = o1.getAge() - o2.getAge();
            result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
            return result;
        });
        Teacher t1 = new Teacher("zhangsan", 23);
        Teacher t2 = new Teacher("lisi", 22);
        Teacher t3 = new Teacher("wangwu", 24);
        Teacher t4 = new Teacher("zhaoliu", 24);
        treeSet.add(t1);
        treeSet.add(t2);
        treeSet.add(t3);
        treeSet.add(t4);
        for (Teacher teacher : treeSet) {
            System.out.println(teacher);
        }
    }
}

class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
