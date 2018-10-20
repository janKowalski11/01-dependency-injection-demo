package pl.mysite.didemo.controllers;
/*
Author: BeGieU
Date: 27.09.2018
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.mysite.didemo.services.GreetingService;
import pl.mysite.didemo.services.GreetingServiceImpl;


//UWAGA: property injection jest nie wskazana wogole!!!

/*UWAGA!!!
 * ten przyklad pokazuje jak nie robic dependency injection
 * i wogole nie pisac kodu
 * */
@Controller
public class PropertyInjectedController
{
    //DOBRA PRAKTYKA MOWI ZE POWINNISMY AUTOWIROWAC
    //INTERFEJSY NIE KLASY IMPLEMENTUJACE INTERFEJSY
    //WTEDY KOD JEST BARDZIEJ ELASTYCZNY!!!
    //W SETTER I CONSTRUCTOR INJECTED CONTROLLERS
    //TO JEST ROBIONE!!!
    @Autowired
    public GreetingServiceImpl greetingService;


    //UWAGA: ta metoda nie polecana, NAJLEPSZA PRAKTYKA TO uzywac Qualifier a !!!

    //Spring potrafi dopasowac odpowiednia implementacje
    // na podstawie nazwy implementacji interfejsu
    //mimo ze mamy az 3 implementacje GreetingService

    //UWAGA: jesli jakis service jest primary to spring ignoruje nazwe i
    //ustawia primary dlatego najlepiej uzywac qualifiera!!
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

}
