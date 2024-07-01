package com.company.service;

import com.company.dao.UserDao;

public class UserServiceImpl implements UserService {
    UserDao userDao;

    @Override
    public void doService () {
        userDao.delete(1);
    }

    public void setUserDao (UserDao userDao) {
        this.userDao = userDao;
    }
}