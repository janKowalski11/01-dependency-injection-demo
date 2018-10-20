package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 05.10.2018
*/

public class PrimaryGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Greeting - Primary Greeting Service says";
    }
}
