package com.xupt;

import java.lang.reflect.Method;

/**
 * 通过Class对象操作类的方法
 */
public class Reflect4 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.xupt.Person");

        //得到Person类的所有方法
       /* Method[] method = c.getDeclaredMethods();
        for (Method method1 : method ) {
            System.out.println("method1 = " + method1);
        }*/

        //得到所有的共有方法
        Method[] methods = c.getMethods() ;
        for (Method m : methods) {
            System.out.println("m = " + m);
        }

        Method method = c.getMethod("show");
        System.out.println(method);
    }
}

