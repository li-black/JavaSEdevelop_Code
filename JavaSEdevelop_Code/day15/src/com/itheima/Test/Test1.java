package com.itheima.Test;
//发送端

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if ("886".equals(s)) {
                break;
            }
            byte[] bytes = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.100.1"), 10000);
            ds.send(dp);
        }
        ds.close();
    }
}
