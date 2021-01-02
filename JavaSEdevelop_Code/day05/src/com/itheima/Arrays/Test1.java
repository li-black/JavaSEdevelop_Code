package com.itheima.Arrays;
//Arrays工具类使用

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 6, 7,};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        binarySearch返回索引，否则返回插入点减一，因为可能返回插入点0所以要减一
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = Arrays.binarySearch(arr1, 10);
        System.out.println(i);
        int j = Arrays.binarySearch(arr1, 0);
        System.out.println(j);
    }
}
