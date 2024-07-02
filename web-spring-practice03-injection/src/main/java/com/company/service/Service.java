package com.company.service;

import com.company.pojo.Student;
import com.company.pojo.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
    public static void main (String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student) applicationContext.getBean("student");
//        System.out.println(student.toString());

        // practice singleton scope of bean
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Address address1 = (Address)applicationContext.getBean("address");
//        Address address2 = (Address)applicationContext.getBean("address");
//        System.out.println(address2.hashCode() == address1.hashCode());

        // practice prototype scope of bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Address address1  = (Address) applicationContext.getBean("address");
        Address address2  = (Address) applicationContext.getBean("address");
        System.out.println(address1.hashCode() == address2.hashCode());

    }
}