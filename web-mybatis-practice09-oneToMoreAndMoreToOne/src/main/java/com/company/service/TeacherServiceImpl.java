package com.company.service;

import com.company.dao.TeacherMapper;
import com.company.util.MybatisUtils;
import com.company.pojo.Teacher;
import org.junit.jupiter.api.Test;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public Teacher getTeacher(int id) {
        TeacherMapper teacherMapper = MybatisUtils.getSqlSession().getMapper(TeacherMapper.class);
        return teacherMapper.selectById(id);
    }

    @Test
    public void test () {
        Teacher teacher = this.getTeacher(1);
        System.out.println(teacher.toString());
    }
}