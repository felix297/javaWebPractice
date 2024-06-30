package com.company.service;

import com.company.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import com.company.pojo.User;
import com.company.dao.UserMapper;
import org.junit.Test;

public class UserService {
    public User selectById(int id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectById(id);
    }

    @Test
    public void test() {
        User user = this.selectById(15);
        System.out.println(user.toString());
    }
}