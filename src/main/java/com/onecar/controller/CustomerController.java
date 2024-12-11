package com.onecar.controller;

import com.onecar.domain.Car;
import com.onecar.domain.Customer;
import com.onecar.service.CustomerService;

public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public Customer registerCustomer(String firstName, String lastName, String phone, String email) {
        return customerService.registerCustomer(firstName, lastName, phone, email);
    }

    public Car addCar(Long customerId, String made, String model, String vin) {
        return customerService.addCarToCustomer(customerId, made, model, vin);
    }
}
