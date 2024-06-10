package com.designpattern.structural.facadePattern;

public class HotelKeeperImpl implements HotelKeeper{

    @Override
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu)vegRestaurant.getMenus();
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenus();
    }
}
