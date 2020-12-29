package com.itheima.Polymorpic2;

//多态能够提高代码的扩展性
public class TestPolymorpic {
    public static void main(String[] args) {
        useanimal(new Dog());
        useanimal(new Cat());
        System.out.println("----------");
        Animal getanimal = getanimal(1);
        getanimal.eat();
        Animal getanimal1 = getanimal(3);
        getanimal1.eat();
        System.out.println("----------");
        useanimal(getanimal(3));
        useanimal(getanimal(1));
    }

    public static void useanimal(Animal animal) {
        animal.eat();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
        }
    }

    public static Animal getanimal(int type) {
        if (type == 1) {
            return new Cat();
        } else {
            return new Dog();
        }
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
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}