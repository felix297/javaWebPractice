package com.company.dao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public int delete (int id) {
        System.out.println("mysql...");
        return 1;
    }
}