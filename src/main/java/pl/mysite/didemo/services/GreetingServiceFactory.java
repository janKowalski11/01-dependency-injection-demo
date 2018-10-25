package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 18.10.2018
*/


import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory
{
    @Autowired
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository)
    {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang)
    {
        switch (lang)
        {
            case "en":
                return new PrimaryGreetingService();

            case "de":
                return new PrimaryGermanGreetingService();

            case "es":
                return new PrimarySpanishGreetingService();

            default:
                return new PrimaryGreetingService();
        }
    }
}
