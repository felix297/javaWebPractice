package com.company.service;

import com.company.pojo.User;
import java.util.ArrayList;
import com.company.dao.UserDao;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class UserServiceImpl {
    @Test
    public void test() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            ArrayList<User> userArrayList = userDao.selectAll();
            for (User ele: userArrayList) {
                System.out.println(ele.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}