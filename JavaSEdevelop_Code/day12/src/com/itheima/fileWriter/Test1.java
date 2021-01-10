package com.itheima.fileWriter;
//FileWriter的基本使用方法
//最常用的为字符串写入

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test1 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("day12\\src\\file\\a.txt");
            writer.write('a');
            writer.write(97);
            writer.write("\r\n");
            char[] chars1 = new char[]{97, 98, 99, 100, 101};
            writer.write(chars1);
            writer.write("\r\n");
            char[] chars2 = new char[]{97, 98, 99, 100, 101};
            writer.write(chars2, 0, 3);
            writer.write("\r\n");
            writer.write("你好");
            writer.write("\r\n");
            writer.write("你好", 0, 1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
