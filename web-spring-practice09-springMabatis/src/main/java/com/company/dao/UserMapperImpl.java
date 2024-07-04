package com.company.dao;

import org.mybatis.spring.SqlSessionTemplate;
import java.util.ArrayList;
import com.company.pojo.User;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession (SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public ArrayList<User> selectAll () {
        return sqlSession.getMapper(UserMapper.class).selectAll();
    }

}