package com.company.advisor;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class Annotation {
    @Before("execution(* com.company.dao.UserMapper.*(..))")
    public void before () {
        System.out.println("before method -- by annotation");
    }

    @After("execution(* com.company.dao.UserMapper.*(..))")
    public void after () {
        System.out.println("after method -- by annotation");
    }
}