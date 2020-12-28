package com.itheima.CodeTest;

public class Test {
    public static void main(String[] args) {
        Big big1 = new Big();
        Big big2 = new Big();
    }
}

class Big {
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public void show() {
        int a = 10;
        {
            int b = 10;
        }
    }

}