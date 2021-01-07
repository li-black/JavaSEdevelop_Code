package com.itheima.streamflow;
//Stream流使用

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //集合的批量添加
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));

        //Stream流
        list1.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}
