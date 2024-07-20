package com.hariprasath.api_gateway.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class APICircuitBreakerController {

    private static final String ORDERSERVICE = "orderService";
    private static final String PAYMENTERVICE = "paymentService";


    @GetMapping("order")
    @CircuitBreaker(name = ORDERSERVICE, fallbackMethod = "orderServiceFallback")
    public Mono<String> orderServiceFallback() {
        return Mono.just("Order Service is currently unavailable. Please try again later.");
    }

    @GetMapping("payment/getAllData")
    @CircuitBreaker(name = PAYMENTERVICE, fallbackMethod = "paymentServiceFallback")
    public Mono<String> paymentServiceFallback() {
        return Mono.just("Payment Service is currently unavailable. Please try again later.");
    }
}
