package com.company.dao;

import com.company.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    public Teacher selectById(int id);
}