package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 05.10.2018
*/

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "-->ConstructorGreetingService.sayGreeting():  Hello, i was injected by Constructor!";
    }
}
