package com.itheima.file;
//利用递归统计后缀名相同的文件出现的个数

import java.io.File;
import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("day11");
        HashMap<String, Integer> map = new HashMap<>();
        getcount(file, map);
        System.out.println(map);
    }

    private static void getcount(File file, HashMap<String, Integer> map) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                String[] splitarr = file1.getName().split("\\.");
                if (splitarr.length == 2) {
                    String filename = splitarr[1];
                    if (map.containsKey(filename)) {
                        map.put(filename, map.get(filename) + 1);
                    } else {
                        map.put(filename, 1);
                    }
                }
            } else {
                getcount(file1, map);
            }
        }
    }
}
