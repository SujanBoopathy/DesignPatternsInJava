package com.designpattern.creational.prototypePattern;

public class ShapeClient {
    private Shape shapeProtoType;
    public Shape createShape(){
       return shapeProtoType.clone();
    }

    public ShapeClient(Shape shapeProtoType){
        this.shapeProtoType = shapeProtoType;
    }
}
