package pl.mysite.didemo.controllers;
/*
Author: BeGieU
Date: 26.09.2018
*/

import org.springframework.beans.factory.annotation.Autowired;
import pl.mysite.didemo.services.GreetingService;


public class MyController
{

    private GreetingService greetingService;

   /* Bez qualifiera bedzie injekcja @primary bean z odpowiedniego profilu

    Spring widzi tylko Beany z wlaczonego profilu !!! Gdy nie ma profilu
    w properties to spring i tak nie widzi beanow oznaczonych profilami
    widzi tyko te bez profilu */
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

