package com.itheima.TCP;
//TCP接收端

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
//        字节流方法
//        int by;
//        while ((by = inputStream.read()) != -1) {
//            System.out.print((char) by);
//        }
        br.close();
        inputStream.close();
        ss.close();
    }
}
