package com.company.dao;

import java.util.Map;
import java.util.ArrayList;
import com.company.pojo.User;

public interface UserDao {
    public ArrayList<User> selectAll();
    public User selectById(int id);
    public ArrayList<User> fuzzyQuery(String keyword);

    public int deleteById(int id);

    public int add (User user);

    public int update (User user);
    public int updateByMap (Map<Object, Object> params);
}