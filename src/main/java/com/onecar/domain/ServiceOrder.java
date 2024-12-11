package com.onecar.domain;

import java.util.List;

public class ServiceOrder {
    private Long id;
    private Car car;
    private OrderStatus status;
    private List<ServiceItem> items;
    private double totalCost;
}
