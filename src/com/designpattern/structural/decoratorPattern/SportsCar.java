package com.designpattern.structural.decoratorPattern;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Adding sports car features");
    }
}
