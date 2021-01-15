package com.itheima.TCPtest.Test;
//线程类

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Runnablesocket implements Runnable {
    private Socket accept;

    public Runnablesocket(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            bos = new BufferedOutputStream(new FileOutputStream("day15\\src\\com\\file\\" + UUID.randomUUID().toString() + ".png"));
            int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("上传成功");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
