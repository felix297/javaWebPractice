package com.company.dao;

import com.company.pojo.User;
import org.apache.ibatis.type.Alias;

//@Alias("UserMapper")
public interface UserMapper {
    public User selectById(int id);
}