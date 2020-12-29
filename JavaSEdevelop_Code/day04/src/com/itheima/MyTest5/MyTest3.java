package com.itheima.MyTest5;

//有参有返回值
public class MyTest3 {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                System.out.print(a + "+" + b + "=");
                return a + b;
            }
        });
        useCalculator((int a, int b) -> {
            System.out.print(a + "*" + b + "=");
            return a * b;
        });
    }

    public static void useCalculator(Calculator calculator) {
        int result = calculator.calc(10, 20);
        System.out.println(result);
    }
}

interface Calculator {
    int calc(int a, int b);
}