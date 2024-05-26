package com.designpattern.creational.factoryPattern;

public class PlanFactory {
    public Plan getPlan(String planType){
        if(planType.equals("DOMESTIC")){
            return new DomesticPlan();
        }
        else if(planType.equals("INDUSTRIAL")){
            return new IndustrialPlan();
        }
        return null;
    }
}
