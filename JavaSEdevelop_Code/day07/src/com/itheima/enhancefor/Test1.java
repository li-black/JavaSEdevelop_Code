package com.itheima.enhancefor;
//增强for循环

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("b");
        a.add("c");
        a.add("d");
        for (String s : a) {
            System.out.println(s);
        }
    }
}
