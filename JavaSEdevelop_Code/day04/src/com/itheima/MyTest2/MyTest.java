package com.itheima.MyTest2;

//私有成员内部类和静态内部类的使用
public class MyTest {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.show();
        Outer.Inner2.show2Static();
    }
}

class Outer {
    private int num = 10;

    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

    public static class Inner2 {
        public void show() {
            System.out.println("show2");
        }

        public static void show2Static() {
            System.out.println("static");
        }
    }
}