package com.designpattern.creational.abstractFactoryPattern;

public class HatchPack implements  Car{

    @Override
    public void assemble() {
        System.out.println("Assembling hatch pack car parts ");
    }
}
