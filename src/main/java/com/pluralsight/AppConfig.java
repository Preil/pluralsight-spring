package com.pluralsight;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Ilya 15.06.2017.
 */

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean (name = "customerService")
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        return customerService;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

/*    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }*/
}
