package com.itheima.socket;
//接收端

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] bys = new byte[3];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);
        System.out.println(new String(bys, 0, dp.getLength()));
        ds.close();
    }
}
