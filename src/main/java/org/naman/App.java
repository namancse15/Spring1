package org.naman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //object is being created at this line
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.code();
        System.out.println(obj1.age);
//
//        Alien obj2 = (Alien) context.getBean("alien1");
//        obj2.code();
//        System.out.println(obj2.age);

//        Laptop lap = (Laptop) context.getBean("laptop");
//        System.out.println(lap.getName()); //setter injection , check in XML
    }
}
