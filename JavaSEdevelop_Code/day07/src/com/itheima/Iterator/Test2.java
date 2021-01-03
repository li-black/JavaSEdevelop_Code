package com.itheima.Iterator;
//迭代器删除集合元素，看iterator的ArrayList源码
//双向迭代器在下面

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("b");
        a.add("c");
        a.add("d");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("b")) {
                iterator.remove();
            }
        }
        System.out.println(a);
//        双向迭代器
        ListIterator<String> iterator1 = a.listIterator();
        while (iterator1.hasNext()) {
            String s = iterator1.next();
            System.out.println(s);
        }
        System.out.println("----------------------------");
        while (iterator1.hasPrevious()) {
            String s = iterator1.previous();
            System.out.println(s);
        }
    }
}
