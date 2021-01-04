package com.itheima.setaggregate;
//Set集合的创建与遍历

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("ccc");
        set.add("aaa");
        set.add("bbb");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("-------------------------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
