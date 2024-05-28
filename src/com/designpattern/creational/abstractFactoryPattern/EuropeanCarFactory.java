package com.designpattern.creational.abstractFactoryPattern;

public class EuropeanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new HatchPack();
    }

    @Override
    public CarSpecs createCarSpecs() {
        return new EuropeCarSpecs();
    }
}
