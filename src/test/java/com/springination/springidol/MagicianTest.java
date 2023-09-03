package com.springination.springidol;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;

public class MagicianTest {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
            "applicationContext.xml");
Volunteer volunteer = new Volunteer();
Magician magician = (Magician) ctx.getBean("magician");
    @Test
    public void magicianShouldReadVolunteersMind() {
        volunteer.thinkSomething("Queen of Hearts");
        assertEquals("Queen of Hearts", magician.getThoughs());
    }
}