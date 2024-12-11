package com.onecar.repository;

import com.onecar.domain.Customer;

public interface CustomerRepository {
    Customer findById(Long id);
    Customer save(Customer customer);
}
