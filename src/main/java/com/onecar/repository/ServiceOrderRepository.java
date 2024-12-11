package com.onecar.repository;

import com.onecar.domain.ServiceOrder;

import java.util.List;

public interface ServiceOrderRepository {
    ServiceOrder findById(Long id);
    ServiceOrder save(ServiceOrder order);
    List<ServiceOrder> findByCarId(Long carId);
}
