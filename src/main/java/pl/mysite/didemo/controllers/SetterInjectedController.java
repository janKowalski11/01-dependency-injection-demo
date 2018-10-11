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
public class SetterInjectedController
{
    //DOBRA PRAKTYKA AUTOWIROWANIE INTERFEJSU
    private GreetingService greetingService;

    /*
    * Setter injection jest generalnie gorsze od Constructor injection
    * ale jego zastosowanie to wtedy gdy inicjaliizacja jakiegos pola
    * nie jest obowiazkowa a opcjonalna */
    @Autowired
    public void setGreetingService(
            @Qualifier("setterGreetingService") GreetingService greetingService
    )
    {
        this.greetingService = greetingService;
    }


    public String sayHello()
    {
        return   greetingService.sayGreeting();
    }

}
