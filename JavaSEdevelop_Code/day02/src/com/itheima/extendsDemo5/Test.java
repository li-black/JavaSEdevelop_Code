package com.itheima.extendsDemo5;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi("zhangsan", 10, "caotan");
        zi.show();
    }
}

class Fu {
    private String name;
    private int age;

    Fu() {
    }

    Fu(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Zi extends Fu {
    private String address;

    public Zi() {
    }

    public Zi(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    public void show() {
        System.out.println(this.getName() + "..." + this.getAge() + "..." + this.address);
    }
}
