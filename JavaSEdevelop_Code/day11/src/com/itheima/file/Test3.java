package com.itheima.file;
//创建文件之前要判断文件夹是否存在，如果存在再创建文件

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("day11\\src\\file\\ddd");
        if (!file.exists()) {
            file.mkdir();
        }
        File file1 = new File(file, "a.txt");
        file1.createNewFile();
    }
}
