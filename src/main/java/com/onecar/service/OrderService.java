package com.onecar.service;


import com.onecar.domain.OrderStatus;
import com.onecar.domain.ServiceOrder;
import com.onecar.repository.CarRepository;
import com.onecar.repository.ServiceOrderRepository;
import com.onecar.repository.ServiceTypeRepository;

public class OrderService {
    private final ServiceOrderRepository orderRepository;
    private final CarRepository carRepository;
    private final ServiceTypeRepository serviceTypeRepository;

    public OrderService(ServiceOrderRepository orderRepository,
                        CarRepository carRepository,
                        ServiceTypeRepository serviceTypeRepository) {
        this.orderRepository = orderRepository;
        this.carRepository = carRepository;
        this.serviceTypeRepository = serviceTypeRepository;
    }

    public ServiceOrder createOrderForCar(Long carId) {
        // Найти car, создать ServiceOrder со статусом CREATED
        return null;
    }

    public ServiceOrder addServiceItem(Long orderId, Long serviceTypeId, double laborCost, double partsCost, int quantity) {
        // Найти order, serviceType, добавить ServiceItem, пересчитать totalCost
        return null;
    }

    public ServiceOrder updateOrderStatus(Long orderId, OrderStatus status) {
        // Найти order, обновить статус
        return null;
    }

    public ServiceOrder getOrderDetails(Long orderId) {
        // Найти order, вернуть
        return null;
    }
}
