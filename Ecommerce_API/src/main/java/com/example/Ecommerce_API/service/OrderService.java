package com.example.Ecommerce_API.service;

import com.example.Ecommerce_API.model.Order;
import com.example.Ecommerce_API.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public void createOrder(Order order) {
        orderRepo.save(order);
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderRepo.findById(id);
    }
}
