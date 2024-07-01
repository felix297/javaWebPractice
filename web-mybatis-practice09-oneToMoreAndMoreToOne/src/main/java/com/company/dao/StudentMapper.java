package com.company.dao;

import com.company.pojo.Student;
import java.util.ArrayList;

public interface StudentMapper {
    public ArrayList<Student> selectStudents();
}