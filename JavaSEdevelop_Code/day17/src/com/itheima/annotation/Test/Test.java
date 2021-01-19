package com.itheima.annotation.Test;
//注解类

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//指明注解的存活时间到RUNTIME
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
}
