package com.designpattern.structural.decoratorPattern;

import javax.swing.*;

public class DecoratorDemo {
    public static void main(String args[]){
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxuryCar.assemble();
    }
}
