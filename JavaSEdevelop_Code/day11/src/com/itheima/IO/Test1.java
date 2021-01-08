package com.itheima.IO;
//用IO流来写入字节

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("day11\\src\\file\\a.txt");
        outputStream.write(97);
        outputStream.close();
    }
}
