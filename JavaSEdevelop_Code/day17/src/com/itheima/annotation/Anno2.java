package com.itheima.annotation;
//自定义注解类

import com.itheima.enumeration.Test1;

public @interface Anno2 {
    public int num() default 10;

    public String name();

    public Class clazz() default String.class;

    public Anno1 anno() default @Anno1(name = "zhangsan");

    public Test1 test1() default Test1.Spring;

    public int[] arr() default {1, 2, 3, 4, 5};

    public Test1[] tests() default {Test1.Spring, Test1.Summer};

}
