package com.example.Ecommerce_API.controller;

import com.example.Ecommerce_API.model.Order;
import com.example.Ecommerce_API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }

    @GetMapping("order/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
}
