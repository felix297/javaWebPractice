package com.company.pojo;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Teacher {
    private int id;
    private String name;
    private ArrayList<Student> students;
}