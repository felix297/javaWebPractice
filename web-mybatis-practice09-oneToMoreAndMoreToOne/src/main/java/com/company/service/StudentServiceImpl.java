package com.company.service;

import com.company.dao.StudentMapper;
import com.company.util.MybatisUtils;
import java.util.ArrayList;
import com.company.pojo.Student;
import org.junit.jupiter.api.Test;

public class StudentServiceImpl implements StudentService {
    public ArrayList<Student> selectStudents(){
        StudentMapper studentMapper = MybatisUtils.getSqlSession().getMapper(StudentMapper.class);
        return studentMapper.selectStudents();
    }

    @Test
    public void test() {
        ArrayList<Student> studentArray = this.selectStudents();
        for (Student ele: studentArray) {
            System.out.println(ele.toString());
        }
    }
}