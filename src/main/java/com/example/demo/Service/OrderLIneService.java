package com.example.demo.Service;
import com.example.demo.Entities.OrderLine;
import com.example.demo.Repositories.OrderLineRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderLIneService {

    private OrderLineRepository orderLineRepository;

    @Autowired
    public void OrderLineService(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    public OrderLIneService(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    public List<OrderLine> getAllOrderLines() {
        return orderLineRepository.findAll();
    }

    public Optional<OrderLine> getOrderLineById(Long id) {
        return orderLineRepository.findById(id);
    }

    public OrderLine saveOrderLine(OrderLine orderLine) {
        return orderLineRepository.save(orderLine);
    }

    public void deleteOrderLine(Long id) {
        orderLineRepository.deleteById(id);
    }

}
