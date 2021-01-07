package com.itheima.streamflow;
//流的基本使用

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("dd");
        arrayList.add("aa");
        arrayList.add("eee");
        arrayList.add("eee");
        arrayList.add("eee");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("aaa");
        arrayList1.add("bbb");
        arrayList1.add("ccc");
        arrayList1.add("dd");
        arrayList1.add("aa");
        arrayList1.add("eee");
//        取前三个
        arrayList.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("----------------------");
//        取前三个之后的所有
        arrayList.stream().skip(3).forEach(s -> System.out.println(s));
        System.out.println("----------------------");
//        两个流合并
        Stream<String> stream = Stream.concat(arrayList.stream(), arrayList1.stream());
        stream.forEach(s -> System.out.println(s));
        System.out.println("----------------------");
//        流的去重如果是对象需要重写比较方法
        arrayList.stream().distinct().forEach(s -> System.out.println(s));
    }
}
