package pl.mysite.didemo.services;
/*
Author: BeGieU
Date: 05.10.2018
*/

/*
 * W Takiej kombinacji czyli @Profile("es") potem @Primary
 * spring uznaje ta implementacje za primary ale TYLKO W TYM PROFILU
 * Oczywiscie w kazdym profilu moze byc jedno primary
 *
 * Primary ustawiane w application.properties
 */



public class PrimarySpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "PrimarySpanishGreetingService.sayGreeting(): Servicio de Saludo Primatio";
    }
}
