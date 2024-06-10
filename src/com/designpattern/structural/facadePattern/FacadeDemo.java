package com.designpattern.structural.facadePattern;

public class FacadeDemo {
    public static void main(String args[]){
        HotelKeeper hotelKeeper = new HotelKeeperImpl();
        VegMenu vegMenu = hotelKeeper.getVegMenu();
        NonVegMenu nonVegMenu = hotelKeeper.getNonVegMenu();
        vegMenu.menuList();
        nonVegMenu.menuList();
    }
}
