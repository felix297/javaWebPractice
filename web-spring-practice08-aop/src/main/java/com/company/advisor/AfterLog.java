package com.company.advisor;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning (Object returnValue, Method method, Object[] args, Object target) {
        System.out.println(target.getClass().getName() + "'s method " + method.getName() + "'s return value is " + returnValue);
    }
}
