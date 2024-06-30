package com.company.service;

import java.util.Map;
import java.util.HashMap;
import com.company.dao.UserMapper;
import java.util.ArrayList;
import com.company.pojo.User;
import com.company.util.MybatisUtils;
import org.junit.jupiter.api.Test;

public class UserServiceImpl implements UserService {
    @Override
    public ArrayList<User> selectAll(Map<String, Integer> params) {
        UserMapper userMapper = MybatisUtils.getSqlSession().getMapper(UserMapper.class);
        return userMapper.selectAll(params);
    }

    @Test
    public void test () {
        HashMap<String, Integer> params = new HashMap<>();
        params.put("startNum", 3);
        params.put("pageSize", 3);
        ArrayList<User> userArray = this.selectAll(params);

        for (User ele: userArray) {
            System.out.println(ele.toString());
        }
    }
}