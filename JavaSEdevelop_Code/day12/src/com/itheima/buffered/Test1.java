package com.itheima.buffered;
//BufferedReader和BufferedWriter对数组读入后排序之后重新写入

import java.io.*;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("day12\\src\\file\\sort.txt"));
        String line = bf.readLine();
        System.out.println(line);
        bf.close();
        String[] str = line.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        String string = Arrays.toString(arr);
        System.out.println(string);
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12\\src\\file\\sort.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.close();
    }
}
