package com.zee.CustomerProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
        CustomerClass c1 = context.getBean("c1",CustomerClass.class);
        System.out.println(c1);
        
        CustomerClass c2 = context.getBean("c2",CustomerClass.class);
        System.out.println(c2);
        
        CustomerClass c3 = context.getBean("c3",CustomerClass.class);
        System.out.println(c3);
    }
}
