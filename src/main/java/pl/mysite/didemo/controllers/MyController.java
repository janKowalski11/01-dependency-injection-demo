package pl.mysite.didemo.controllers;
/*
Author: BeGieU
Date: 26.09.2018
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.mysite.didemo.services.GreetingService;

@Controller
public class MyController
{

    private GreetingService greetingService;

    //Bez qualifiera bedzie injekcja @primary bean
    @Autowired
    public MyController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        System.out.println("\n-->MyController.sayHello(): " + greetingService.sayGreeting());
        return null;
    }
}

