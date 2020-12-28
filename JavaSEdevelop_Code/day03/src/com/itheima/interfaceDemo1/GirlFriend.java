package com.itheima.interfaceDemo1;

//一个类实现多个接口
public class GirlFriend implements ICoder, IGame {
    @Override
    public void code() {
        System.out.println("敲代码");
    }

    @Override
    public void play() {
        System.out.println("玩魔兽");
    }
}
