package com.microsoft;

public class Student {
    public Student () {}

    private String stuId;
    private String name;
    private int age;
    private String phone;

    public void setStuId (String stuId) {
        this.stuId = stuId;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public void setPhone (String phone) {
        this.phone = phone;
    }

    public String getStuId () {
        return this.stuId;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public String getPhone () {
        return this.phone;
    }
}