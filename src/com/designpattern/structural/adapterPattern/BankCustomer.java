package com.designpattern.structural.adapterPattern;

public class BankCustomer extends BankDetails implements CreditCard{

    @Override
    public void getBankDetails() {
        setAccountHolderName("sujan");
        setBankName("hdfc");
        setAccountNumber("193939390100030303");
    }

    @Override
    public void getCreditCard() {
        System.out.println("Account no -"+getAccountNumber()+" is eligible for "+getAccountHolderName()+" in "+getBankName()+" bank");
    }
}
