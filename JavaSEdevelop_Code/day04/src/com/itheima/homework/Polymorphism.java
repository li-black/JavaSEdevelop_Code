package com.itheima.homework;

public class Polymorphism {
    public static void main(String[] args) {
        showPrice(new normalUser(), 1000);
        showPrice(new superUser(), 1000);
    }

    public static void showPrice(User user, int price) {
        user.show(price);
    }
}

interface User {
    void show(int price);
}

class normalUser implements User {

    @Override
    public void show(int price) {
        System.out.println("价格为:" + price);
    }
}

class superUser implements User {

    @Override
    public void show(int price) {
        System.out.println("价格为：" + 0.9 * price);
    }
}