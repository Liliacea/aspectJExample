package springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "springExample.xml");
        Performer performer = (Performer) ctx.getBean("smb");
        performer.perform();


      /*  Thinker thinker = (Thinker) ctx.getBean("volunteer");
        thinker.thinkOfSomething("Aaa");

       */
        ctx.close();
    }
}
