package com.company.dao;

import org.apache.ibatis.annotations.Param;
import java.util.ArrayList;
import com.company.pojo.User;

public interface UserMapper {
    public ArrayList<User> selectUser (@Param("username") String userName, @Param("rolecode") String roleCode);

    public int update (User user);
}