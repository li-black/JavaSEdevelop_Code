package com.itheima.MyTest5;

//带参无返回值
public class MyTest1 {
    public static void main(String[] args) {
        useIEat(new IEat() {
            @Override
            public void eat(String string) {
                System.out.println("匿名内部类" + string);
            }
        });
        useIEat((String string) -> {
            System.out.println("lambda实现" + string);
        });
    }

    public static void useIEat(IEat iEat) {
        iEat.eat("红烧肉");
    }
}

interface IEat {
    void eat(String string);
}