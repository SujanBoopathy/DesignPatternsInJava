package com.designpattern.creational.builderPattern;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    }

    public static class ComputerBuilder{
        private String HDD;
        private String RAM;

        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM){
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setBluetoothSetting(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setGraphicCardSetting(boolean isGraphicCardEnabled){
            this.isGraphicCardEnabled = isGraphicCardEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
