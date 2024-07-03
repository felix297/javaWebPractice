package com.company.staticProxy;

public class LandlordProxy {
    Landlord landlord;

    public LandlordProxy () {}

    public LandlordProxy (Landlord landlord) {
        this.landlord = landlord;
    }

    public void setLandlord (Landlord landlord) {
        this.landlord = landlord;
    }

    public void rent () {
        this.visit();
        this.landlord.rent();
        this.contract();
    }

    public void visit () {
        System.out.println("The proxy is take the customer having a visit in the landlord's house...");
    }

    public void contract () {
        System.out.println("The proxy is signing the contract with the customer...");
    }
}