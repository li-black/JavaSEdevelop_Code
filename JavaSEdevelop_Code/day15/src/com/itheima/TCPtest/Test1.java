package com.itheima.TCPtest;
//客户端

import java.io.*;
import java.net.Socket;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10002);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("你好");
        bw.flush();
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        bw.close();
        socket.close();
    }
}
