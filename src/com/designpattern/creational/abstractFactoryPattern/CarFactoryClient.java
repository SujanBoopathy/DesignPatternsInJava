package com.designpattern.creational.abstractFactoryPattern;

public class CarFactoryClient {
    public static void main(String args[]){
        // Indian Cars
        CarFactory indianCarFactory = new IndianCarFactory();
        Car indianCar = indianCarFactory.createCar();
        CarSpecs indianCarSpecs = indianCarFactory.createCarSpecs();

        indianCar.assemble();
        indianCarSpecs.display();

        // European Cars
        CarFactory europeanCarFactory = new EuropeanCarFactory();
        Car europeanCar = europeanCarFactory.createCar();
        CarSpecs europeanCarSpecs = europeanCarFactory.createCarSpecs();

        europeanCar.assemble();
        europeanCarSpecs.display();
    }
}
