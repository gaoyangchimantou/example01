package com.bfsu.example01.configuration;

import com.bfsu.example01.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MyConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    public MyService getMyService(){
        System.out.println("产生MyService.................................................");
        return new MyService();
    }
}
