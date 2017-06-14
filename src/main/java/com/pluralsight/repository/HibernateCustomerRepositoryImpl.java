package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Ilya 14.06.2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();
        customer.setFirstname("Ilya");
        customer.setLastname("Preobrazhenskiy");

        customers.add(customer);
        return customers;
    }
}
