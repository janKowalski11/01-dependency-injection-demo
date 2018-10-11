package pl.mysite.didemo.controllers;

/*
Author: BeGieU
Date: 27.09.2018
*/


import org.junit.Before;
import org.junit.Test;
import pl.mysite.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest
{

    private SetterInjectedController setterInjectedController;

    @Before
    public void SetUp() throws Exception
    {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,
                setterInjectedController.sayHello());
    }

}
