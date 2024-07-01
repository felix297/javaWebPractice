package com.company.dao;

public class UserDaoSQLServerImpl implements UserDao {
    @Override
    public int delete (int id) {
        System.out.println("SQLServer...");
        return 1;
    }

}