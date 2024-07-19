package com.hariproject.payment_service.controller;

import com.hariproject.payment_service.entity.Payment;
import com.hariproject.payment_service.entity.WapperEntiry;
import com.hariproject.payment_service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{getId}")
    public Optional<Payment> getPayment(@PathVariable("getId") Integer payment){
        return paymentService.getPayment(payment);
    }


    @GetMapping("/getAllData/{Id}")
    public WapperEntiry getAllData(@PathVariable("Id") Integer id){
        return paymentService.getAlldata(id);
    }

}
