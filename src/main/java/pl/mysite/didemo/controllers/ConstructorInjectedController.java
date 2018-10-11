package pl.mysite.didemo.controllers;
/*
Author: BeGieU
Date: 27.09.2018
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.mysite.didemo.services.GreetingService;

@Controller
public class ConstructorInjectedController
{
    private GreetingService greetingService;

    /*Constructor injection to najlepszy praktyka
    dependency injection
    poniewaz zapewnia nam ze pola zostana zainijowane
    jesli nie zastana dostaniemy blad kompilacji
    a nie run time error co jest duuzym plusem
    */
    @Autowired
    public ConstructorInjectedController(
            @Qualifier("constructorGreetingService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
