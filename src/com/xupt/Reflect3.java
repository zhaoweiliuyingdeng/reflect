package com.xupt;

import java.lang.reflect.Field;


/**
 * 通过反射得到一个类的属性，并给属性设置值
 */
public class Reflect3 {
    public static void main(String[] args) throws Exception {
        //通过反射得到一个类的Class对象
        Class c = Class.forName("com.xupt.Person") ;
        //创建一个类实例
        Object obj = c.newInstance() ;
        
       /*
        //得到所有共有的属性
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }*/

        /*//得到一个类的所有属性
        Field[] fields1 = c.getDeclaredFields();
        for (Field f: fields1) {
            System.out.println("f = " + f);
        }*/

        //给属性设值
        //得到一个属性
        Field field = c.getField("name");
        field.set(obj,"刘心");
        System.out.println(obj);

        Field field1 = c.getDeclaredField("adress");
        field1.setAccessible(true);
        field1.set(obj,"身边");
        System.out.println(obj);
    }
}
