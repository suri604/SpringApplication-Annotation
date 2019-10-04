package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class beanConfig {
    @Bean
    public Actor getActor()
    {   Actor actor = new Actor("Akshay Kumar","Male",52);
        return actor;
    }
    @Bean
    public Actor getActor2()
    {   Actor actor2 = new Actor("Salman khan","Male",55);
        return actor2;
    }
    @Bean
    public Actor getActor3()
    {   Actor actor3 = new Actor("Ajay Devgan","Male",50);
        return actor3;
    }
    @Bean({"MovieA","MovieB"})
    @Scope("prototype")
    public Movie getMovie()
    {
        Movie movie = new Movie(getActor(),getActor2(),getActor3());

        return movie;
    }

}
