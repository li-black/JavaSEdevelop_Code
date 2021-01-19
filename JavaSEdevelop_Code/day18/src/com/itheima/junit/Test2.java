package com.itheima.junit;
//利用junit测试方法类中的方法

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test2 {
    //    在每个Test执行之前执行Before里的代码
//    记住每个
    @Before
    public void before() {
        System.out.println("先执行");
    }

    //    不使用断言
    @Test
    public void testdev() {
        Test1 test1 = new Test1();
        int dev = test1.dev(1, 1);
        System.out.println(dev);
    }

    //使用断言比较期望值与实际计算的值是否相等
    @Test
    public void testadd() {
        Test1 test1 = new Test1();
        int add = test1.add(10, 20);
        Assert.assertEquals(30, add);
        System.out.println(add);
    }

    //    在每个Test执行之后执行After里的代码
//    记住每个
    @After
    public void after() {
        System.out.println("最后执行");
    }

}
