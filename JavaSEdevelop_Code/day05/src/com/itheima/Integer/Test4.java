package com.itheima.Integer;

//将字符串用空格分隔取出其中的数字并转换成int类型存入int类型的输入，最后打印数组
public class Test4 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strarr = s.split(" ");
        int[] arr = new int[strarr.length];
        for (int i = 0; i < strarr.length; i++) {
            arr[i] = Integer.parseInt(strarr[i]);
            System.out.print(arr[i] + " ");
        }
    }
}
