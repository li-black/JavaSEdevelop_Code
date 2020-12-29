package com.itheima.MyTest4;

//局部内部类的使用
public class MyTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}

class Outer {
    private int num = 10;

    public void method() {
        int age = 20;
        class Inner {
            public void show() {
                System.out.println(num);
                System.out.println(age);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
}