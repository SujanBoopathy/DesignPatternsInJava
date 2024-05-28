package com.designpattern.creational.abstractFactoryPattern;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling sedan car parts ");
    }
}
