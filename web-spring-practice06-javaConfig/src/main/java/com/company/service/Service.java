package com.company.service;

import com.company.pojo.Cat;
import com.company.config.CatConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Service {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CatConfig.class);
        Cat cat = applicationContext.getBean("getCat", Cat.class);
        System.out.println(cat.toString());
    }
}