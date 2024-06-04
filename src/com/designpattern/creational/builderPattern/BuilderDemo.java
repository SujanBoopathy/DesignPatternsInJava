package com.designpattern.creational.builderPattern;

public class BuilderDemo {
    public static void main(String args[]){
        Computer computer = new Computer.ComputerBuilder("1TB","18GB").setBluetoothSetting(true).setGraphicCardSetting(true).build();
        System.out.println("HDD :"+ computer.getHDD());
        System.out.println("RAM :"+ computer.getRAM());
        System.out.println("Bluetooth :"+ computer.isBluetoothEnabled());
        System.out.println("GraphicCard :"+ computer.isGraphicCardEnabled());


    }
}
