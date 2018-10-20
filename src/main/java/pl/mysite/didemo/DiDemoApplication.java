package pl.mysite.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mysite.didemo.controllers.ConstructorInjectedController;
import pl.mysite.didemo.controllers.MyController;
import pl.mysite.didemo.controllers.PropertyInjectedController;
import pl.mysite.didemo.controllers.SetterInjectedController;

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


        Object bean = appContext.getBean("myController");
        if (!(bean instanceof MyController))
        {
            System.out.println("ERROR with creating instance of bean called controller");
            return;
        }
        MyController controller = (MyController) bean;

        controller.sayHello();

        System.out.println(appContext.getBean(PropertyInjectedController.class).sayHello());

        System.out.println(appContext.getBean(SetterInjectedController.class).sayHello());

        System.out.println(appContext.getBean(ConstructorInjectedController.class).sayHello());


    }
}
