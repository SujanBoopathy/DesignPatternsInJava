package com.designpattern.creational.singletonPattern;

public class Singleton {
    public static volatile Singleton instance;

    public Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    return new Singleton();
                }
            }
        }
        return instance;
    }

    public void print(){
        System.out.println("hello world");
    }

    public static void main(String args[]){
        Singleton instance = Singleton.getInstance();
        instance.print();
    }
}


