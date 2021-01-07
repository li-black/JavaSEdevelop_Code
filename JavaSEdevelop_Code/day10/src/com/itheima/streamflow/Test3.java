package com.itheima.streamflow;
//stream流的filter对数据进行筛选

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张亮");
        arrayList.add("张无忌");
        arrayList.add("谢广坤");
        arrayList.add("凤凰传奇");
        arrayList.add("张出山");
        arrayList.stream()
                .filter(s -> s.length() == 3)
                .filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));
    }
}
