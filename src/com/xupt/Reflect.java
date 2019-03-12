package com.xupt;

/**
 * 获得Person类的class对象
 * 获得class对象的三种方法
 */
public class Reflect {
    public static void main(String[] args) throws Exception{
        //方法一
        Person person = new Person() ;
        Class c = person.getClass() ;

        //方法二
        Class c2 = Person.class ;
        System.out.println(c==c2);

        //方法三
        Class c3 = Class.forName("com.xupt.Person") ;
        System.out.println(c3==c);

    }
}
