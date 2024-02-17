package com.example.demo.Service;

import com.example.demo.Entities.OrderTable;
import com.example.demo.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderTable> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderTable getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public OrderTable saveOrder(OrderTable order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
