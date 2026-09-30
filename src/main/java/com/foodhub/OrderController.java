package com.foodhub;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @PostMapping("/orders")
    public String createOrder() {
        return "FoodHub order created successfully";
    }

    @GetMapping("/orders")
    public String getOrders() {
        return "FoodHub Orders: Order-101, Order-102";
    }
}
