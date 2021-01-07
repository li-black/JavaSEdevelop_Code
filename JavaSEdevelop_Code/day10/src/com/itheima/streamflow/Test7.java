package com.itheima.streamflow;
//流的收集操作collect
//收集为map
//要指定key和value

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("zhangsan,23");
        arrayList.add("lisi,24");
        arrayList.add("wangwu,25");
        Map<String, String> map = arrayList.stream().filter(s ->
                Integer.parseInt(s.split(",")[1]) >= 24
        ).collect(Collectors.toMap(
                s -> s.split(",")[0],
                s -> s.split(",")[1]
        ));
        System.out.println(map);
    }
}
