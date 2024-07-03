package com.company.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
//@Scope("prototype")
public class Cat {
    @Value("tom")
    private String name;

    @Value("male")
    private String gender;

    public void setName (String name) {
        this.name = name;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getName () {
        return this.name;
    }

    public String getGender () {
        return this.gender;
    }

    public String toString () {
        return "name: " + name + " gender: " + gender;
    }
}
