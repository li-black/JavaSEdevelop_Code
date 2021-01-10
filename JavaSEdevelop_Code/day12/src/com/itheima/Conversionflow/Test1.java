package com.itheima.Conversionflow;
//用InputStreamReader和OutputStreamWriter实现不同编码之间的相互转换

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day12\\src\\file\\c.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day12\\src\\file\\c-1.txt"), "UTF-8");
        int ch;
        while ((ch = isr.read()) != -1) {
            osw.write(ch);
        }
        isr.close();
        osw.close();
    }
}
