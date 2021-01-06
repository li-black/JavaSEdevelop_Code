package com.itheima.map;
//遍历集合的第一种方法
//通过map.keySet()获取到所有的key然后通过遍历key在遍历的同时通过key获取到value来实现遍历

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    }
}
