package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Ilya 14.06.2017.
 */

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${someProperty}")
    private String property;

    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Ilya");
        customer.setLastname(property);

        customers.add(customer);
        return customers;
    }
}
