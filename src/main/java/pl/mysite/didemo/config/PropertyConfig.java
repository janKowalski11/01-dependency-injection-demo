package pl.mysite.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import pl.mysite.didemo.examplebeans.FakeDataSource;
import pl.mysite.didemo.examplebeans.FakeJmsBroker;

/*
Author: BeGieU
Date: 25.10.2018
*/
@Configuration
@PropertySource(
        {
                "classpath:datasource.properties",
                "classpath:jms.properties"
        })
/*to samo innymi slowy*/
//@PropertySource(
//        {
//                @PropertySource( "classpath:datasource.properties"),
//                @PropertySource("classpath:jms.properties")
//        }
//)
public class PropertyConfig
{
    @Autowired
    private Environment environment;

    @Value("${guru.username}")
    private String user;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.url}")
    private String url;

    @Value("${guru.jms.username}")
    private String jmsUser;

    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Value("${guru.jms.url}")
    private String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource()
    {
        FakeDataSource fakeDataSource = new FakeDataSource(
                environment.getProperty("USERNAME"),
                password,
                url
        );
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker()
    {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker(
                jmsUser,
                jmsPassword,
                jmsUrl
        );

        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties()
    {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();

        return propertySourcesPlaceholderConfigurer;
    }
}
