package com.itheima.TCPtest.Test;
//客户端上传图片
//读取服务端返回的上传成功

import java.io.*;
import java.net.Socket;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("day15\\src\\com\\file\\12.png"));
        Socket socket = new Socket("127.0.0.1", 10002);
        BufferedOutputStream bo = new BufferedOutputStream(socket.getOutputStream());
        int by;
        while ((by = bi.read()) != -1) {
            bo.write(by);
        }
        bo.flush();
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        bo.close();
        socket.close();
        bi.close();
    }
}
