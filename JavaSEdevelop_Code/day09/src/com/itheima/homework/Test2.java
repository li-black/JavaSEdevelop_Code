package com.itheima.homework;

import java.util.HashMap;
import java.util.logging.Handler;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        System.out.println(map);
    }
}
