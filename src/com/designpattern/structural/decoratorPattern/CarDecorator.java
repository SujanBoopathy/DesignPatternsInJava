package com.designpattern.structural.decoratorPattern;

public abstract class CarDecorator implements Car{

    Car car;

    public CarDecorator(Car car){
        this.car = car;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}
