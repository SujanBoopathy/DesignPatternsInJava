package com.designpattern.structural.compositePattern;

public class Circle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Drawing "+color+" circle");
    }
}
