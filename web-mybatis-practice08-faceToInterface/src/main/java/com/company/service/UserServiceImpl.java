package com.company.service;

import com.company.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import com.company.util.MybatisUtils;
import com.company.pojo.User;
import org.junit.jupiter.api.Test;

public class UserServiceImpl implements UserService {
    @Override
    public User selectById(int id){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectById(id);
    }

    @Test
    public void test() {
        System.out.println(this.selectById(15).toString());
    }
}