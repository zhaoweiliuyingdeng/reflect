package com.xupt;

import java.lang.reflect.Constructor;

/**
 * 通过class对象得到构造方法，创建一个对象
 */
public class Reflect2 {
    public static void main(String[] args)throws Exception{
        //首先通过反射得到一个对象的class对象
        Class c = Class.forName("com.xupt.Person") ;
        //通过Class类对象的constructor
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor:constructors) {
            System.out.println("constructor = " + constructor);
        }
        Constructor constructor = c.getDeclaredConstructor();
        Constructor constructor1 = c.getDeclaredConstructor(String.class) ;
        constructor1.setAccessible(true);
        //创建一个对象
        Object obj = constructor1.newInstance("北京") ;
        System.out.println("obj = " + obj);
    }

}
