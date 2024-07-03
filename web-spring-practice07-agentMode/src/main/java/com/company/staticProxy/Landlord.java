package com.company.staticProxy;

public class Landlord implements Rent {
    @Override
    public void rent () {
        System.out.println("The landlord is renting house with the client...");
    }
}