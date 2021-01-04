package com.itheima.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Question01 {
    public static void main(String[] args) {
        /**
         * 调用createArrayListByRandomSize()方法获取一个ArrayList,使用普通for循环进行遍历打印.
         */
        ArrayList<Integer> arrayListByRandomSize = createArrayListByRandomSize();
        for (int i = 0; i < arrayListByRandomSize.size(); i++) {
            int a = arrayListByRandomSize.get(i);
            System.out.print(a);
        }
        System.out.println();
        /**
         * 调用createArrayListByRandomSize()方法获取一个ArrayList,使用迭代器进行遍历打印.
         */
        Iterator<Integer> it = arrayListByRandomSize.iterator();
        while (it.hasNext()) {
            int a = it.next();
            System.out.print(a);
        }
        System.out.println();
        /**
         * 调用createArrayListByFixedSize()方法获取一个ArrayList,使用列表迭代器进行遍历打印.
         */
        ArrayList<Integer> arrayListByFixedSize = createArrayListByFixedSize();
        ListIterator<Integer> it1 = arrayListByFixedSize.listIterator();
        while (it1.hasNext()) {
            int a = it1.next();
            System.out.print(a);
        }
        System.out.println();
        /**
         * 调用createArrayListByFixedSize()方法获取一个ArrayList,使用增强For循环进行遍历打印.
         */
        for (Integer integer : arrayListByFixedSize) {
            System.out.print(integer);
        }
        System.out.println();
        /**
         * 调用createArrayListByFixedSize()方法获取一个ArrayList,使用列表迭代器从后向前进行遍历打印.
         */
        while (it1.hasPrevious()) {
            int a = it1.previous();
            System.out.print(a);
        }
        System.out.println();

    }

    /**
     * 随机生成一个长度为10以内的ArrayList,ArrayList的泛型是Integer,里面是随机生成的数据.
     */
    private static ArrayList<Integer> createArrayListByRandomSize() {
        //创建ArrayList.
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(10) + 1; i++) {
            list.add(new Random().nextInt(100));
        }
        return list;
    }

    /**
     * 生成一个长度为10的ArrayList,ArrayList的泛型是Integer,里面是随机生成的数据.
     */
    private static ArrayList<Integer> createArrayListByFixedSize() {
        //创建ArrayList.
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        return list;
    }
}
