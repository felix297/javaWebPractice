package com.company.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.pojo.*;

public class Main {
    public static void main (String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Hello hello = (Hello) applicationContext.getBean("hello");
//        System.out.println(hello.getMsg());

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Service service = (Service)applicationContext.getBean("service");
//        service.printMsg();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Hello hello = (Hello)applicationContext.getBean("hello");
//        System.out.println(hello.getMsg());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello)applicationContext.getBean("hello");
        hello.setMsg("Hello! Spring! -- by bean-id 'hello' ");
        System.out.println(hello.getMsg());

        Hello hello2 = (Hello) applicationContext.getBean("hello2");
        hello2.setMsg("Hello! Spring! -- by bean-name 'hello2'");
        System.out.println(hello2.getMsg());

        Hello hello3 = (Hello)applicationContext.getBean("hello3");
        hello3.setMsg("Hello! Spring! -- by alias 'hello3'");
        System.out.println(hello3.getMsg());

        Hello hello4 = (Hello) applicationContext.getBean("hello4");
        hello4.setMsg("Hello! Spring! -- by bean-name 'hello4'");
        System.out.println(hello4.getMsg());


    }
}