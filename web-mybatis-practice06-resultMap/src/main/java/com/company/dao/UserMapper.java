package com.company.dao;

import com.company.pojo.User;

public interface UserMapper {
    public User selectById(int id);
}