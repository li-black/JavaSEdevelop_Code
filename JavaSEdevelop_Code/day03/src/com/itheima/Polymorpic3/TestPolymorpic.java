package com.itheima.Polymorpic3;
//多态中父类指向子类，但是可以用强制转换将其转换为子类，然后就能够调用子类特有的方法

public class TestPolymorpic {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
//        强制转换
        Cat cat = (Cat) animal;
        cat.show();
    }
}

class Animal {
    public void eat() {
        System.out.println("吃");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void show() {
        System.out.println("我是狸花猫");
    }
}
