package com.company.dynamicProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class LandlordHandler implements InvocationHandler {
    Rent rent;

    public void setRent (Rent rent) {
        this.rent = rent;
    }

    public Object getProxy () {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] params) throws InvocationTargetException, IllegalAccessException {
        Object result;
        this.visit();
        result = method.invoke(this.rent, params);
        this.contract();
        return result;
    }

    public void visit () {
        System.out.println("The proxy is taking the customer to visit the house to be rented...");
    }

    public void contract () {
        System.out.println("The proxy is taking the customer to sign the contract with the landlord...");
    }
}