package com.designpattern.creational.factoryPattern;

public class Planner {
    public static void main(String args[]){
        PlanFactory factory = new PlanFactory();
        Plan domestic = factory.getPlan("DOMESTIC");
        int bill = domestic.calculate(10);
        System.out.println(bill);

        Plan industrial = factory.getPlan("INDUSTRIAL");
        bill = industrial.calculate(10);
        System.out.println(bill);
    }
}
