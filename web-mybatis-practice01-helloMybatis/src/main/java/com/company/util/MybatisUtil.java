package com.company.util;

import com.company.dao.UserDao;
import com.company.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MybatisUtil {
    public static SqlSession getSqlSession () {
        String resource = "mybatis-config.xml";
        SqlSession sqlSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

    @Test
    public void test (){
        SqlSession sqlSession = this.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        ArrayList<User> userList = userDao.selectAll();
        for (User ele : userList) {
            System.out.println(ele.toString());
        }
    }

}