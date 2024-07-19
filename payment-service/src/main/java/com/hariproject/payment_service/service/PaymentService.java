package com.hariproject.payment_service.service;

import com.hariproject.payment_service.entity.Payment;
import com.hariproject.payment_service.entity.WapperEntiry;

import java.util.Optional;

public interface PaymentService {
    Optional<Payment> getPayment(Integer payment);

    WapperEntiry getAlldata(Integer id);
}
