package com.company.config;

import com.company.pojo.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.company.pojo")
public class CatConfig2 {
    @Bean
    public Cat getCat () {
        return new Cat();
    }
}
