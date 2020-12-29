package com.itheima.MyTest5;

//无参无返回值
public class MyTest {
    public static void main(String[] args) {
        useShowHander(new IshouHandler() {
            @Override
            public void show() {
                System.out.println("匿名类实现");
            }
        });
        useShowHander(() -> {
            System.out.println("lambda实现");
        });
    }

    public static void useShowHander(IshouHandler ishouHandler) {
        ishouHandler.show();
    }
}

interface IshouHandler {
    void show();
}