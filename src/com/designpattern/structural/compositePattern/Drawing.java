package com.designpattern.structural.compositePattern;

import java.util.*;

public class Drawing implements Shape{
    private List<Shape> shapeList = new ArrayList<>();
    @Override
    public void draw(String color) {
        for(Shape shape : shapeList){
            shape.draw(color);
        }
    }

    public void add(Shape shape){
        shapeList.add(shape);
    }

    public void remove(Shape shape){
        shapeList.remove(shape);
    }

    public void clear(){
        System.out.println("Clearing all the shapes ...");
        this.shapeList.clear();
    }


}
