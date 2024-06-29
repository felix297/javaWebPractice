package com.company.dao;

import java.util.ArrayList;
import com.company.pojo.User;

public interface UserDao {
    public ArrayList<User> selectAll();
}