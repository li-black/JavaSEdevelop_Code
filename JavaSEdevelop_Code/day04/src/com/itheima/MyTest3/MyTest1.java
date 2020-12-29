package com.itheima.MyTest3;

//匿名内部类在开发中的使用
public class MyTest1 {
    public static void main(String[] args) {
        goswimming(new Swimming() {
            @Override
            public void swimming() {
                System.out.println("去游泳~");
            }
        });
    }

    public static void goswimming(Swimming swimming) {
        swimming.swimming();
    }
}

interface Swimming {
    void swimming();
}