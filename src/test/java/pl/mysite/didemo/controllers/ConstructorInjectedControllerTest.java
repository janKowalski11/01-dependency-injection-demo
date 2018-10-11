package pl.mysite.didemo.controllers;
/*
Author: BeGieU
Date: 27.09.2018
*/

import org.junit.Before;
import org.junit.Test;

import pl.mysite.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/*
ConstructorInjectedController jest najczesciej uzywany bo
Nie ma mozliwosci stworzenia instancji bez zapewnienia Pol
Przy setter injection mozna stworzyc objekt i nie zainicjalizowac
pol i to prowadzi do null pointer exception
zeby to zobaczyc wystarczy zakomentowac w testach SetterConstructora
linijke:
this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
i wtedy mamy null pointer exception
*/

public class ConstructorInjectedControllerTest
{
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception
    {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting()
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }

}
