package com.itheima.homework;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Poker> list = new ArrayList<>();
        //大小王
        Poker bigJoker = new Poker("", "1", "joker");
        Poker smallJoker = new Poker("", "2", "joker");
        list.add(bigJoker);
        list.add(smallJoker);

        //52张基本牌 4个花色*13个基本牌构成
        String[] types = {"♠", "♥", "♣", "♦"};
        String[] names = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String type : types) {
            for (String name : names) {
                Poker poker;
                if (type.equals("♥") || type.equals("♦")) {
                    poker = new Poker(type, "3", name);
                } else {
                    poker = new Poker(type, "4", name);
                }

                list.add(poker);
            }
        }
        System.out.println(list);
        System.out.println("======================================");

        // 洗牌
        Collections.shuffle(list);

        // 发牌
        List<Poker> player1 = new LinkedList<>();
        List<Poker> player2 = new LinkedList<>();
        List<Poker> player3 = new LinkedList<>();
        List<Poker> dipai = new LinkedList<>();
        for (int i = 0; i < 51; i++) {
            if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }
        for (int i = 51; i < 54; i++) {
            dipai.add(list.get(i));
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
        Iterator<Poker> it = player1.iterator();
    }
}

class Poker {
    // 花色
    private String type;
    // 颜色
    private String color;
    // 名称
    private String name;

    public Poker(String type, String color, String name) {
        this.type = type;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        switch (color) {
            case "1":
                // 红底灰字
                return "{" + "\033[41;37m" + type + name + "\033[m" + "}";
            case "2":
                // 黑底灰字
                return "{" + "\033[40;37m" + type + name + "\033[m" + "}";
            case "3":
                // 红字
                return "{" + "\033[31m" + type + name + "\033[m" + "}";
            default:
                // 黑字
                return "{" + type + name + "}";
        }
    }
}