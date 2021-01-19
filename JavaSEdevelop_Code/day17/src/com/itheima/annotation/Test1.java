package com.itheima.annotation;

//注解测试类
@Anno2(name = "zhangsan", num = 20, clazz = int.class, anno = @Anno1(name = "zhangsan"), test1 = com.itheima.enumeration.Test1.Spring,
        arr = {1, 2, 3}, tests = {com.itheima.enumeration.Test1.Summer, com.itheima.enumeration.Test1.Summer})
public class Test1 {
}
