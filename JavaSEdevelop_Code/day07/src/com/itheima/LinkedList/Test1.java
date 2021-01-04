package com.itheima.LinkedList;
//LinkedList的特有功能

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        首位添加元素
/*        list.addFirst("ddd");
        System.out.println(list);*/
//        末位添加元素
/*        list.addLast("ddd");
        System.out.println(list);*/
//        取出首位和末位元素
/*        String first = list.getFirst();
        String last = list.getLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(list);*/
//        删除首位和末位元素
/*        String s = list.removeFirst();
        String s1 = list.removeLast();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(list);*/
    }
}
