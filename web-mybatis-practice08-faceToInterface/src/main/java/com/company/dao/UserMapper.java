package com.company.dao;

import com.company.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;

public interface UserMapper {
    @Select("select * from smbms_user where id = #{uid}")
    @Result(column="userPassword", property="pwd")
    public User selectById(@Param("uid") int id);
}