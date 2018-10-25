package pl.mysite.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mysite.didemo.controllers.MyController;
import pl.mysite.didemo.examplebeans.FakeDataSource;

/*
 * //defultowo componentscan jest wlaczany dla wszystkich packages
 * znajdujacych sie ponizej package gdzie jest annotacja
 * @SpringBootApplication
 * mozna to zmienic za pomoca @ComponentScan*/
@SpringBootApplication
public class DiDemoApplication
{


    public static void main(String[] args)
    {

        //SpringApplication always returns the  Appcontext when starts
        ApplicationContext appContext = SpringApplication.run(DiDemoApplication.class, args);


        MyController myController = (MyController) appContext.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) appContext.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());


    }
}
