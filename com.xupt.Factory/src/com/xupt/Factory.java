package com.xupt;

public class Factory {
    public static Human makeHuman(String type){
        if (type.equals("man")){
            Human man = new Man() ;
            return man ;
        }else if(type.equals("woman")){
            Human woman = new Woman() ;
            return woman ;
        }else {
            return null ;
        }
    }
    //test
    public static void main(String[] args) {
        Human man = Factory.makeHuman("man");
        man.say();
    }
}
