package com.itheima.TCPtest;
//服务端

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        Socket accept = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("接收成功");
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        accept.close();
        ss.close();
    }
}
