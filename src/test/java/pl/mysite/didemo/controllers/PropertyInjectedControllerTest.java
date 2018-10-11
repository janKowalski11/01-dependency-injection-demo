package pl.mysite.didemo.controllers;
/*
Author: BeGieU
Date: 27.09.2018
*/


import org.junit.Before;
import org.junit.Test;
import pl.mysite.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;


/*UWAGA!!!
 * ten przyklad pokazuje jak nie robic dependency injection
 * i wogole nie pisac kodu
 * property injection jest nie wskazana wogole
 *
 * */
public class PropertyInjectedControllerTest
{

    private PropertyInjectedController propertyInjectedController;

    //TESTOWANIE
    @Before
    public void SetUp() throws Exception
    {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,
                propertyInjectedController.sayHello());
    }

}
