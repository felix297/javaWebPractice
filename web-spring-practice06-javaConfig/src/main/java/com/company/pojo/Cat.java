package com.company.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Cat {
    @Value("tom")
    private String name;

    @Value("female")
    private String gender;

    public void setName (String name) {
        this.name = name;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName () {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }
}