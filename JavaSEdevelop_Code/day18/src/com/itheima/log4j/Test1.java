package com.itheima.log4j;
//用slf4j接口来获取日志，常用日志有四个级别总共有7个级别，
// 推荐用工厂来设置好处是更换日志实现类不需要修改代码
//级别的显示要在配置文件中去修改

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        LOGGER.debug("debug级别");
        LOGGER.info("info级别");
        LOGGER.warn("warn级别");
        LOGGER.error("error级别");
    }
}
