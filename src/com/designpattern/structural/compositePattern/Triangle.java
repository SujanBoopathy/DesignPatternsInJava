package com.designpattern.structural.compositePattern;

public class Triangle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Drawing "+color+" triangle");
    }
}
