package pl.mysite.didemo.config;
/*
Author: BeGieU
Date: 18.10.2018
*/


/*
* Zrefaktorowany projekt 01-di-demmo
* teraz korzysta z najpopularniejszej metody
* pisania w springu czyli konfiguracji za pomaca
* javy w tym pliku*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import pl.mysite.didemo.controllers.MyController;
import pl.mysite.didemo.services.GreetingRepository;
import pl.mysite.didemo.services.GreetingService;
import pl.mysite.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig
{
    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository repository)
    {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    @Autowired
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return  greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"es"})
    @Autowired
    public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    @Autowired
    public GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Profile({"default","en"})
    @Autowired
    public MyController myController(GreetingServiceFactory greetingServiceFactory)
    {
        return new MyController(greetingServiceFactory.createGreetingService("en"));
    }
}
