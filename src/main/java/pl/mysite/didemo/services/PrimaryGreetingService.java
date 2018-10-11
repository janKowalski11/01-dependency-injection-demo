package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 05.10.2018
*/

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","en"}) //jesli nie ma wybranego profily w application.properties to wybierze default !!!
@Primary //jesli mamy kilka implementacji interfejsow to spring wybiera primary
public class PrimaryGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Greeting - Primary Greeting Service says";
    }
}
