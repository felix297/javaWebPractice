package com.company.service;

import java.util.Map;
import java.util.ArrayList;
import com.company.pojo.User;

public interface UserService {
    public ArrayList<User> selectAll(Map<String, Integer> params);
}