package com.company.service;

import com.company.dao.UserMapper;
import com.company.util.MybatisUtils;
import java.util.ArrayList;
import com.company.pojo.User;
import org.junit.jupiter.api.Test;

public class UserServiceImpl implements UserService {
    @Override
    public ArrayList<User> select (String userName, String roleCode) {
        UserMapper userMapper = MybatisUtils.getSqlSession().getMapper(UserMapper.class);
        return userMapper.selectUser(userName, roleCode);
    }

    @Override
    public int update (User user) {
        UserMapper userMapper = MybatisUtils.getSqlSession().getMapper(UserMapper.class);
        return userMapper.update(user);
    }

    @Test
    public void test () {
        ArrayList<User> userArrayList = this.select(null, null);
        for (User ele: userArrayList) {
            System.out.println(ele.toString());
        }
//
//        User user = new User();
//        user.setId(3);
////        user.setUserName("韩路彪");
//        user.setUserCode("hanlubiao");
//        System.out.println(this.update(user));
    }
}