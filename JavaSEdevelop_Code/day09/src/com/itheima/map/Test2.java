package com.itheima.map;
//遍历集合的第一种方法
//通过map.keySet()获取到所有的key然后通过遍历key在遍历的同时通过key获取到value来实现遍历

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //V put(K key,V value)：添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String s = map.get(key);
            System.out.println(key + "----------" + s);
        }
        Collection<String> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        System.out.println(map);
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "---" + value);
        }
        for (String key : map.keySet()) {
            System.out.println("key= " + key + " and value= " + map.get(key));
        }
    }
}
