package com.itheima.fileWriter;
//键盘录入用户名和密码并保存到b.txt中
//注意要换行

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名");
        String username = sc.next();
        System.out.println("密码");
        String password = sc.next();
        FileWriter fw = null;
        try {
            fw = new FileWriter("day12\\src\\file\\b.txt", true);
            fw.write(username);
            fw.write("\r\n");
            fw.write(password);
            fw.write("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
