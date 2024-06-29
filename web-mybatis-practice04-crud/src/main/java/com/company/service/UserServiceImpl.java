package com.company.service;

import java.util.HashMap;
import com.company.pojo.User;
import java.util.ArrayList;
import com.company.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.junit.jupiter.api.Test;

public class UserServiceImpl {
    @Test
    public void test() {
        SqlSession sqlSession = null;
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();

            UserDao userDao = sqlSession.getMapper(UserDao.class);
            // delete
//            System.out.println(userDao.deleteById(20));

//            User user = new User();
//            user.setId(16);
//            user.setUserCode("zhaoliu");
//            user.setUserName("王五");
            // add
//            System.out.println(userDao.add(user));
//            System.out.println(userDao.update(user));

            // updateByMap
//            HashMap<Object, Object> params = new HashMap<>();
//            params.put("id", 16);
//            params.put("userName", "赵六");
//            params.put("userCode", "zhaoliu");
//            System.out.println(userDao.updateByMap(params));

            // fuzzyQuery
            ArrayList<User> res = userDao.fuzzyQuery("%路");
            for(User ele: res){
                System.out.println(ele.toString());
            }
//            sqlSession.commit();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            sqlSession.close();
        }
    }
}