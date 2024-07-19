package com.hariproject.order_service.service;

import com.hariproject.order_service.entity.OrderServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    RestTemplate restTemplate;


    ArrayList<OrderServiceEntity> list = new ArrayList<>();

    @Override
    public Optional<OrderServiceEntity> getByIdorder(Integer orderId) {

        list.add(new OrderServiceEntity(1,"Mobile", 20000.00, 10));
        list.add(new OrderServiceEntity(2,"Laptop", 30000.00, 20));
        list.add(new OrderServiceEntity(3,"HeadSet", 40000.00, 30));

        for( OrderServiceEntity  getData : list){
          if(orderId.equals(getData.getId()))  {
              return Optional.of(getData);
          }
        }
        return null;
    }
}
