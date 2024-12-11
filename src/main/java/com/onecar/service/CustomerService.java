package com.onecar.service;

import com.onecar.domain.Car;
import com.onecar.domain.Customer;
import com.onecar.repository.CarRepository;
import com.onecar.repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CarRepository carRepository;

    public CustomerService(CustomerRepository customerRepository, CarRepository carRepository) {
        this.customerRepository = customerRepository;
        this.carRepository = carRepository;
    }

    public Customer registerCustomer(String firstName, String lastName, String phone, String email) {
        // Создать Customer, сохранить, вернуть
        return null;
    }

    public Car addCarToCustomer(Long customerId, String made, String model, String vin) {
        // Создать Car, связать с Customer, сохранить
        return null;
    }
}
