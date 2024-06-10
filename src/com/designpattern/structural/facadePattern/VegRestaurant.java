package com.designpattern.structural.facadePattern;

public class VegRestaurant implements Hotel{

    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}
