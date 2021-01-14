package com.itheima.IP;
//InetAddress中的两个方法

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.22.32");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println(address1.getHostAddress());
        System.out.println(address1.getHostName());
    }
}
