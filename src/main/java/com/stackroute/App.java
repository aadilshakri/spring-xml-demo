package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movieInfo = context.getBean("movies", Movie.class);
//        Actor ActorInfo=context.getBean("actors", Actor.class);
        System.out.println(movieInfo.getActor().getAge());
    }
}
