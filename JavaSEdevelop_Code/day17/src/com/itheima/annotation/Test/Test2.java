package com.itheima.annotation.Test;
//注解解析类

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.itheima.annotation.Test.Test1");
        Test1 test1 = (Test1) clazz.getConstructor().newInstance();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
//            判断方法上面是否有注解isAnnotationPresent()
            if (declaredMethod.isAnnotationPresent(Test.class)) {
//                解除私有的访问限制
                declaredMethod.setAccessible(true);
//                运行方法（私有和公有）
                declaredMethod.invoke(test1);
            }
        }
    }
}
