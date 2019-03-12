package com.xupt;

public class Person {
    private int age ;
    public String name ;
    public String adress ;
    public Person (){

    }
    public Person (String name , String adress ,int age){
        this.adress = adress ;
        this.name = name ;
        this.age = age ;
    }
    private Person (String adress , int age){
        this.age = age ;
        this.adress = adress ;
    }
    private Person (String adress){
        this.adress = adress ;
    }
    public void show(){
        System.out.println("show---------------------");
    }

    private void run(){
        System.out.println("cdfdjfdbsb");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
