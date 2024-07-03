package com.company.config;

import com.company.pojo.Cat;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CatConfig2.class)
public class CatConfig {

}