package com.company.pojo;

public class Address {
    private String address;

    public Address () {}

    public Address (String address) {
        System.out.println("c-namespace");
        this.address = address;
    }

    public String getAddress () {
        return this.address;
    }

    public void setAddress (String address) {
        System.out.println("p-namespace");
        this.address = address;
    }


    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}