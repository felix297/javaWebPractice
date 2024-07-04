package com.company.pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String userCode;
    private String userName;
    private String userPassword;
    private String gender;
    private String birthday;
    private String phone;
    private String address;
    private String userRole;
    private String createdBy;
    private String creationDate;
    private String modifyBy;
    private String modifyDate;
}