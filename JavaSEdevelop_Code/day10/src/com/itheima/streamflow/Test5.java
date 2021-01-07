package com.itheima.streamflow;
//stream流的基本使用追加

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list1.add(7);
        //        比较排序
        list1.stream().sorted((o1, o2) -> o2 - o1)
                .filter(s -> s > 3)
                .forEach(s -> System.out.println(s));
        System.out.println("---------------------------");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("3");
        list2.add("1");
        list2.add("2");
        list2.add("9");
        list2.add("7");
//        转换做加法
        Integer sum = list2.stream().mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println(sum);
        System.out.println("---------------------------");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("关羽，97");
        list3.add("张飞，99");
        list3.add("黄忠，96");
        list3.add("赵云，100");
        list3.add("马超，98");
//        分割并且转换后创建对象返回对象
        list3.stream().map(s -> {
            String[] arr = s.split("，");
            Hero hero = new Hero(arr[0], Integer.parseInt(arr[1]));
            return hero;
        }).forEach(s -> System.out.println(s));
//        获取流的长度
        long count = list3.stream().count();
        System.out.println(count);
    }
}

class Hero {
    private String name;
    private int attack;

    public Hero() {
    }

    public Hero(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "hero{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                '}';
    }
}