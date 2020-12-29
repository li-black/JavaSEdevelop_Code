package com.itheima.MyTest1;

//基本内部类的使用
//内部类可以直接调用外部的私有变量，而外部想要调用内部类的的私有变量时需要创建内部类的对象
public class MyTest {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
        Outer outer = new Outer();
        outer.show();
    }
}

class Outer {
    private int num = 10;

    public void show() {
        Inner inner = new Inner();
        System.out.println(inner.age);
        System.out.println("outer");
    }

    public class Inner {
        private int age = 20;

        public void show() {
            System.out.println(num);
            System.out.println("show");
        }
    }
}
