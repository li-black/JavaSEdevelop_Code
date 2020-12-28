package com.itheima.Polymorpic1;
//多态引用父类指向子类，成员变量直接访问父类，成员方法访问子类，
// 如果子类没有重写父类方法，则执行父类方法，但这应该不是多态
public class TestPolymorpic {
    public static void main(String[] args) {
        animal animal = new fish();
        animal.eat();
    }
}

class animal {
    public void eat() {
        System.out.println("吃饭");
    }
}

class fish extends animal {
    @Override
    public void eat() {
        System.out.println("吃草");
    }
}