package com.hariproject.payment_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderServiceEntity {

    private Integer id;
    private String name;
    private double price;
    private Integer qty;
}
