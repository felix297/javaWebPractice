package com.company.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    private String name;
    private Dog cat;
    private Cat dog;

    public People () {}

    public People (String name, Dog dog, Cat cat) {
        this.name = name;
        this.dog = cat;
        this.cat = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDog(Cat dog) {
        this.dog = dog;
    }

    public void setCat(Dog cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return this.cat;
    }

    public Cat getCat() {
        return this.dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}