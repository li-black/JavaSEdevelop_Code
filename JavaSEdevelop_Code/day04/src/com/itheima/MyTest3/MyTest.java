package com.itheima.MyTest3;

//匿名内部类的使用
//想实现两个方法就创建接口实现类然后分别调用两个方法
public class MyTest {
    public static void main(String[] args) {
        new Ishow() {

            @Override
            public void show() {
                System.out.println("匿名内部类");
            }

            @Override
            public void eat() {
                System.out.println("干饭");
            }
        }.show();
    }
}

interface Ishow {
    void show();

    void eat();
}
