package com.designpattern.structural.adapterPattern;

public class AdapterDemo {
    public static void main(String args[]){
        CreditCard targetInterface = new BankCustomer();
        targetInterface.getBankDetails();
        targetInterface.getCreditCard();

    }
}
