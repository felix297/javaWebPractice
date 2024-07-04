package com.company.dao;

import java.util.ArrayList;
import com.company.pojo.User;

public interface UserMapper {
    ArrayList<User> selectAll();
}