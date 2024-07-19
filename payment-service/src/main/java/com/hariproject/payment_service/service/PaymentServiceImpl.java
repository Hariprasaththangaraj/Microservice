package com.hariproject.payment_service.service;

import com.hariproject.payment_service.entity.OrderServiceEntity;
import com.hariproject.payment_service.entity.Payment;
import com.hariproject.payment_service.entity.WapperEntiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    RestTemplate restTemplate;
    ArrayList<Payment> list = new ArrayList<>();

    @Override
    public Optional<Payment> getPayment(Integer payment) {
        list.add(new Payment(1, "success", "Ti12041"));
        list.add(new Payment(2, "success", "Ti1204564212441"));
        list.add(new Payment(3, "failure", "Ti1255sdfsdsdfsdfsdsd041"));

        for (Payment ptm : list) {
            if (ptm.getPaymentId().equals(payment)) {
                return Optional.of(ptm);
            }
        }
        return null;
    }

    @Override
    public WapperEntiry getAlldata(Integer id) {
        WapperEntiry wapperEntiry = new WapperEntiry();
        Optional<Payment> getPaymentData = getPayment(id);

        OrderServiceEntity orderServiceEntity = restTemplate.getForObject("http://ORDER-SERVICE/order/" +
                getPaymentData.get().getPaymentId(), OrderServiceEntity.class);

        wapperEntiry.setOrderService(orderServiceEntity);
        wapperEntiry.setPayment(getPaymentData.get());

        return wapperEntiry;
    }
}
