package com.company.service;

import java.util.ArrayList;
import com.company.pojo.User;

public interface UserService {
    public ArrayList<User> select (String userName, String roleCode);
    public int update (User user);
}