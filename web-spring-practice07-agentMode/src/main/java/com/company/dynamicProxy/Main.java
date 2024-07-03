package com.company.dynamicProxy;

public class Main {
    public static void main (String[] args) {
        Landlord landlord = new Landlord ();
        LandlordHandler handler = new LandlordHandler();
        handler.setRent(landlord);

        Rent proxy = (Rent)handler.getProxy();
        proxy.rent();
    }
}