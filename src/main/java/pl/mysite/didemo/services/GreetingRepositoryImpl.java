package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 20.10.2018
*/


import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository
{
    @Override
    public String getEnglishGreeting()
    {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting()
    {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting()
    {
        return "Primärer Grußdienst";
    }
}
