package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Order {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;

    private String deliveryAddress;

    private LocalDateTime dateOfSubmission;

    //private List<OrderLine> orderlines;

    public Order(User user, String deliveryAddress, LocalDateTime dateOfSubmission) {
        this.user = user;
        this.deliveryAddress = deliveryAddress;
        this.dateOfSubmission = dateOfSubmission;
       // this.orderlines = orderlines;
    }}
