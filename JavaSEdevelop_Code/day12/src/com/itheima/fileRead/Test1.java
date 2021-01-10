package com.itheima.fileRead;
//通过int read()和int read(char[] cbuf)两种方式来读取文件并打印

import java.io.FileReader;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("day12\\src\\file\\a.txt");
/*            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }*/
/*            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                System.out.print(new String(chs, 0, len));
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
