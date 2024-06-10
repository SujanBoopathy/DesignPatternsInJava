package com.designpattern.structural.facadePattern;

public class NonVegRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
