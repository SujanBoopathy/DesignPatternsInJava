package com.designpattern.structural.decoratorPattern;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Adding luxury car features");
    }
}
