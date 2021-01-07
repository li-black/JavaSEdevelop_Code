package com.itheima.map;
//利用map.entrySet()遍历map
//利用forEach遍历map

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //V put(K key,V value)：添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
        map.forEach((k, v) -> {
            System.out.println(k + "---" + v);
        });
    }
}
