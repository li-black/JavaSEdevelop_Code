package com.itheima.Object;

//String中的equals方法和StringBuilder中的equals方法的不同
public class Test3 {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb = new StringBuilder("abc");
        String string = sb.toString();
        System.out.println(s1.equals(sb));
        System.out.println(sb.equals(s1));
        System.out.println(s1.equals(string));
    }
}
