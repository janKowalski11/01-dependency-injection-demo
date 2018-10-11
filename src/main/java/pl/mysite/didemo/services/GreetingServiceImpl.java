package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 27.09.2018
*/

import org.springframework.stereotype.Service;

//@Component tez zadziala zamiast service
@Service
public class GreetingServiceImpl implements GreetingService
{

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting()
    {
        return "-->GreetingServiceImpl.sayGreeting(): " + HELLO_GURUS;
    }
}
