package com.itheima.fileWriter;
//flush方法在写入较大时自动将数据写入，如果较小调用则会直接将写入，在close方法关闭之前也会默认调用flush

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("day12\\src\\file\\a.txt");
            writer.write('a');
            writer.flush();
            writer.write(97);
            writer.write("\r\n");
            writer.write("你好");
            writer.flush();
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
