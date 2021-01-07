package com.itheima.streamflow;
//流的收集操作collect
//收集为list和set

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
//        将流收集为list
        List<Integer> collect1 = arrayList.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect1);
//        将流收集为set由于set的特性所以没有重复元素
        Set<Integer> collect2 = arrayList.stream().filter(s -> s % 2 == 0).collect(Collectors.toSet());
        System.out.println(collect2);
    }
}
