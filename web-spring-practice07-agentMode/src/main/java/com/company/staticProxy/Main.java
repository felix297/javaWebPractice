package com.company.staticProxy;

public class Main {
    public static void main (String[] args) {
        Landlord landlord = new Landlord();

        LandlordProxy landlordProxy = new LandlordProxy (landlord);

        landlordProxy.rent();
    }
}