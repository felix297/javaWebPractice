package com.company.dao;

import com.company.pojo.User;
import java.util.ArrayList;

public interface UserDao {
    public ArrayList<User> selectAll ();
}