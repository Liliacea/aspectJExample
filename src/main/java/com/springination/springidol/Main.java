package com.springination.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
      // Performer performer = (Performer) ctx.getBean("kenny");

       // performer.perform();

        Instrumentalist pianist = new Instrumentalist();

        pianist.perform();
       ctx.close();
    }
}
