package com.designpattern.creational.prototypePattern;

public class Circle implements Shape{
    private String color;
    public Circle(String color){
        this.color = color;
    }
    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("The Drawing of circle of color : "+this.color);
    }
}
