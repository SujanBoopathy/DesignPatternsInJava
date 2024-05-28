package com.designpattern.creational.abstractFactoryPattern;

public class EuropeCarSpecs implements CarSpecs{
    @Override
    public void display() {
        System.out.println("European Car Specs with EU standards and hatch pack type of car");
    }
}
