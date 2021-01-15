package com.itheima.TCPtest;
//服务端接收图片
//接收成功后返回上传成功
//优化1用while循环包裹能够多次上传
//优化2使用UUID.randomUUID()动态生成图片名解决了每次图片名一致造成覆盖的现象

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Test4 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        while (true) {
            Socket accept = ss.accept();
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day15\\src\\com\\file\\" + UUID.randomUUID().toString() + ".png"));
            int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("上传成功");
            bw.flush();
            bw.close();
            bos.close();
            bis.close();
            accept.close();
        }
//        ss.close();
    }
}
