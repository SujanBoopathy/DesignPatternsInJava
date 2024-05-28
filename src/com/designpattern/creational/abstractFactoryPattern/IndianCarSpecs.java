package com.designpattern.creational.abstractFactoryPattern;

public class IndianCarSpecs implements CarSpecs{
    @Override
    public void display() {
        System.out.println("Indian Car Specs : steering wheel at left and sedan type of car");
    }
}
