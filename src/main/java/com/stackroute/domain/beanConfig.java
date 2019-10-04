package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beanConfig {
    @Bean
    public Actor getActor()
    {   Actor actor = new Actor("Akshay Kumar","Male",52);

        return actor;
    }
    @Bean
    public Movie getMovie()
    {

        return new Movie(getActor());
    }

}
