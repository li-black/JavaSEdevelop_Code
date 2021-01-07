package com.itheima.Variableparameters;
//集合的可变参数使用

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
//        可变参数来创建List
        List<String> list1 = List.of("a", "b", "c", "d");
        System.out.println(list1);
//        用ArrayList接收List.of就能实现对list1的拷贝并且能够对list2进行添加修改操作
        ArrayList<String> list2 = new ArrayList<>(List.of("a", "b", "c", "d"));
        list2.add("e");
        System.out.println(list2);
//        Set.of()不能传递重复的元素
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);
//        以两个为分割一个key一个value
        Map<String, String> map = Map.of("zhangsan", "beijing", "lisi", "shanghai");
        System.out.println(map);
//        Map.ofEntries()使代码更具有可读性
        Map<String, String> map1 = Map.ofEntries(
                Map.entry("zhangsan", "beijing"),
                Map.entry("wangwu", "hangzhou"));
        System.out.println(map1);
    }
}
