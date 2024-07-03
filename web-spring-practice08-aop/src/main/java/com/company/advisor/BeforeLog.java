package com.company.advisor;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] params, Object target) {
        System.out.println(target.getClass().getName() + "'s method " + method.getName() + " is carried out!");
    }
}
