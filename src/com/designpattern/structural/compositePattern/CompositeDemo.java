package com.designpattern.structural.compositePattern;

public class CompositeDemo {
    public static void main(String args[]){
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        Drawing drawing = new Drawing();
        drawing.add(circle);
        drawing.add(rectangle);
        drawing.add(triangle);

        drawing.draw("red");

        drawing.remove(circle);

        drawing.draw("blue");

        drawing.clear();

        drawing.draw("yellow");

        drawing.clear();

    }
}
