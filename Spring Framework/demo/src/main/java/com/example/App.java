package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Dev x = context.getBean("d1", Dev.class);

        // System.out.println(x.getAge());    

        x.method();
    }
}
