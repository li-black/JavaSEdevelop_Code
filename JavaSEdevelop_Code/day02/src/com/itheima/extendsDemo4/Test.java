package com.itheima.extendsDemo4;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi(10);
    }
}

class Fu {
    public int age;

    Fu(int age) {
        this.age = age;
        System.out.println("父类有参构造");
    }
}

class Zi extends Fu {
    /*/用无参构造调用有参构造，再用有参构造调用父类有参构造，但是不推荐用
        public Zi() {
            this(10);
        }

        public Zi(int age) {
            super(age);
        }
    */
    public Zi(int age) {
        super(age);
    }
}
