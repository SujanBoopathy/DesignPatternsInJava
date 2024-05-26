package com.designpattern.creational.factoryPattern;

public interface Plan {
    public int getRate();

    public default int calculate(int units){
        return units * getRate();
    }
}
