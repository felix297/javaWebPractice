package com.company.dynamicProxy;

public class Landlord implements Rent {
    @Override
    public void rent () {
        System.out.println("The landlord is paying the key to the customer...");
    }
}