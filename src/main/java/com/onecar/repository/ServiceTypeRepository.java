package com.onecar.repository;

import com.onecar.domain.ServiceType;

import java.util.List;

public interface ServiceTypeRepository {
    ServiceType findById(Long id);
    List<ServiceType> findAll();
}
