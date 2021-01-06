package com.itheima.hashset;
//hashset的基本遍历规则，与特点

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("java");
        hashSet.add("java");
        hashSet.add("java");
        hashSet.add("java");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("=======================");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
