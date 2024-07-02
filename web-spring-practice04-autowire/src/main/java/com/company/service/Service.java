package com.company.service;

import com.company.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) applicationContext.getBean("people");
        System.out.println(people.getName());
        people.getCat().bard();
        people.getDog().bark();
    }
}