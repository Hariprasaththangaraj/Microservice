package com.hariproject.order_service.service;

import com.hariproject.order_service.entity.OrderServiceEntity;

import java.util.Optional;

public interface OrderService{


    Optional<OrderServiceEntity> getByIdorder(Integer orderId);
}
