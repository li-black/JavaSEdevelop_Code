package com.itheima.genericparadigm;
//自定义泛型方法

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> addlist1 = addlist(new ArrayList<String>(), "aa", "bb", "cc", "dd");
        System.out.println(addlist1);
        ArrayList<Integer> addlist2 = addlist(new ArrayList<Integer>(), 1, 2, 3, 4);
        System.out.println(addlist2);
    }

    public static <T> ArrayList<T> addlist(ArrayList<T> list, T t1, T t2, T t3, T t4) {
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }
}
