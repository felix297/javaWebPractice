package com.company.dao;

public class UserMapperImpl implements UserMapper {
    @Override
    public void add () {
        System.out.println("adding a user...");
    }

    @Override
    public void delete () {
        System.out.println("deleting a user...");
    }

    @Override
    public void update () {
        System.out.println("updating a user...");
    }

    @Override
    public void select () {
        System.out.println("selecting all users...");
    }
}