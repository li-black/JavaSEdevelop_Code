package com.itheima.annotation.Test;

//测试注解类有注解的方法才运行
public class Test1 {
    @Test
    public void show() {
        System.out.println("public show");
    }

    @Test
    private void show1() {
        System.out.println("private show1");
    }

    public void show2() {
        System.out.println("show2");
    }
}
