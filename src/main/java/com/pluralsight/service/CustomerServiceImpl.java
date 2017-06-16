package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Ilya 14.06.2017.
 */
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor method injection");
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter method injection");
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
