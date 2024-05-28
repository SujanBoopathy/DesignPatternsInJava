package com.designpattern.creational.abstractFactoryPattern;

public class IndianCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecs createCarSpecs() {
        return new IndianCarSpecs();
    }
}
