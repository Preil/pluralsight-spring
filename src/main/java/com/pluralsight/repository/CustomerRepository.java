package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Ilya 14.06.2017.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
