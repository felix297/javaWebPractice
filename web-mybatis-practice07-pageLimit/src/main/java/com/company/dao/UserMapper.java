package com.company.dao;

import java.util.Map;
import java.util.ArrayList;
import com.company.pojo.User;

public interface UserMapper {
    public ArrayList<User> selectAll (Map<String, Integer> params);
}