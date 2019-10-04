package com.stackroute;


import com.stackroute.domain.Movie;
import com.stackroute.domain.beanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationCont
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(beanConfig.class);
        Movie mov=context.getBean( Movie.class);
        mov.display();
        Movie mov1=context.getBean( Movie.class);
        mov1.display();
        System.out.println(mov==mov1);

    }
}
