package com.onecar.controller;

import com.onecar.domain.OrderStatus;
import com.onecar.domain.ServiceOrder;
import com.onecar.service.OrderService;

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public ServiceOrder createOrder(Long carId) {
        return orderService.createOrderForCar(carId);
    }

    public ServiceOrder addItemToOrder(Long orderId, Long serviceTypeId, double laborCost, double partsCost, int quantity) {
        return orderService.addServiceItem(orderId, serviceTypeId, laborCost, partsCost, quantity);
    }

    public ServiceOrder changeOrderStatus(Long orderId, OrderStatus status) {
        return orderService.updateOrderStatus(orderId, status);
    }

    public ServiceOrder getOrderInfo(Long orderId) {
        return orderService.getOrderDetails(orderId);
    }
}
