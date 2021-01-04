package com.itheima.genericparadigm;

//泛型接口与泛型实现类
public class Test3 {
    public static void main(String[] args) {
        realization1<String> realization1 = new realization1<>();
        realization1.show("aaaaaa");
        realization2 realization2 = new realization2();
        realization2.show(123456);
    }
}

interface Inter<E> {
    void show(E e);
}

class realization1<T> implements Inter<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}

class realization2 implements Inter<Integer> {

    @Override
    public void show(Integer integer) {
        System.out.println(integer);
    }
}