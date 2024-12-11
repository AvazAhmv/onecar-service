package com.onecar.repository;

import com.onecar.domain.Car;

import java.util.List;

public interface CarRepository {
    Car findById(Long id);
    Car save(Car car);
    List<Car> findByCustomerId(Long customerId);
}
