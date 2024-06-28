package com.company.service;

import com.company.pojo.User;
import java.util.ArrayList;
import com.company.dao.UserDao;
import com.company.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class UserServiceImpl {
    @Test
    public void selectAll () {
        SqlSession sqlSesson = MybatisUtil.getSqlSession();
        UserDao userDao = sqlSesson.getMapper(UserDao.class);
        ArrayList<User> userArrayList = userDao.selectAll();
        for(User ele: userArrayList) {
            System.out.println(ele.toString());
        }

    }
}