package com.pluralsight;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ilya 15.06.2017.
 */

@Configuration
public class AppConfig {

    @Bean
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
    }

    @Bean
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }
}
