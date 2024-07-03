package com.company.advisor;

public class PointCut {
    public void before () {
        System.out.println("before method -- by custom class");
    }

    public void after () {
        System.out.println("after method -- by custom class");
    }
}