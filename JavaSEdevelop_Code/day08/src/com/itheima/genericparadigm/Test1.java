package com.itheima.genericparadigm;

//定义一个泛型类并创建对象
public class Test1 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setGift("猫");
        System.out.println(box1.getGift());
        Box<Integer> box2 = new Box<>();
        box2.setGift(888);
        System.out.println(box2.getGift());
    }
}

class Box<E> {
    private E gift;

    public E getGift() {
        return gift;
    }

    public void setGift(E gift) {
        this.gift = gift;
    }
}