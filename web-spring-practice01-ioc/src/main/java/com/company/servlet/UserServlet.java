package com.company.servlet;

import com.company.dao.UserDaoMysqlImpl;
import com.company.dao.UserDaoSQLServerImpl;
import com.company.service.UserServiceImpl;

public class UserServlet {
    public static void main (String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.doService();
        userService.setUserDao(new UserDaoSQLServerImpl());
        userService.doService();
    }
}