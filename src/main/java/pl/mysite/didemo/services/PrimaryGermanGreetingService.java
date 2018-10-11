package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 05.10.2018
*/

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "PrimaryGermanGreetingService.sayGreeting(): Was ist polnische Huren?";
    }
}
