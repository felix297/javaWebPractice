package com.company.dao;

import com.company.dao.UserMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.mybatis.spring.SqlSessionTemplate;
import java.util.ArrayList;
import com.company.pojo.User;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public ArrayList<User> selectAll () {
        return getSqlSession().getMapper(UserMapper.class).selectAll();
    }
}