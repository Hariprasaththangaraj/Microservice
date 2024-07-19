package com.hariproject.order_service.controller;

import com.hariproject.order_service.entity.OrderServiceEntity;
import com.hariproject.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/order/")
public class OrderServiceController {


    @Autowired
    OrderService orderService;

    @GetMapping("/{getId}")
    public Optional<OrderServiceEntity> getByIdorder(@PathVariable("getId") Integer orderId){
        return  orderService.getByIdorder(orderId);
    }


}
