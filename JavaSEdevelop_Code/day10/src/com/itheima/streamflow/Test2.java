package com.itheima.streamflow;
//Stream流的获取方式

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
//        单列数组获取
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.stream().forEach(s -> System.out.println(s));
        System.out.println("-------------------------");
//        双列获取有两种方式
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("zhangsan", 23);
        hm.put("lisi", 24);
        hm.put("wangwu", 25);
        hm.put("zhaoliu", 26);
//        获取keySet方法
        hm.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("---------------------------");
//        获取entrySet方法
        hm.entrySet().stream().forEach(s -> System.out.println(s));
        System.out.println("---------------------------");
//        数组获取
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("---------------------------");
//        同种数据类型的多个数据获取
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
