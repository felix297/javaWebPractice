package com.company.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.pojo.*;

public class Main {
    public static void main (String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Hello hello = (Hello) applicationContext.getBean("hello");
//        System.out.println(hello.getMsg());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Service service = (Service)applicationContext.getBean("service");
        service.printMsg();
    }
}