package com.hariproject.payment_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WapperEntiry {

    private Payment payment;
    private OrderServiceEntity orderService;
}
