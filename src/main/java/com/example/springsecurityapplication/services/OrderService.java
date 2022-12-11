package com.example.springsecurityapplication.services;


import com.example.springsecurityapplication.enumm.Status;
import com.example.springsecurityapplication.models.Order;
import com.example.springsecurityapplication.repositories.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class OrderService {


    private final OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order>getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderId(int id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        return optionalOrder.orElse(null);
    }
    @Transactional
    public void updateOrder(int id, int status) {
        orderRepository.setStatus(id, status);
    }


    public List<Order> search(String search){ return  orderRepository.findByNumberEndingWith(search);};


}
