package com.itheima.TCP;
//TCP发送端

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10002);
        OutputStream os = s.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("你好");
//        字节流方法
//        os.write("你好！".getBytes());
        bw.close();
        os.close();
        s.close();
    }
}
