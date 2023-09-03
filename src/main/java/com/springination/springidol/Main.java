package com.springination.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
       Volunteer volunteer = new Volunteer();
        Magician magician = (Magician) ctx.getBean("magician");
        volunteer.thinkSomething("AAAAAAAAAAAAAAAAAAAAAAa");
        String t = magician.getThoughs();
        System.out.println(t);




       ctx.close();
    }
}
