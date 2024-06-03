package com.designpattern.creational.prototypePattern;

public class ProtoTypeDemo {
    public static void main(String args[]){
        Shape circle = new Circle("red");
        ShapeClient client = new ShapeClient(circle);

        Shape redCircle = client.createShape();

        redCircle.draw();


    }
}
