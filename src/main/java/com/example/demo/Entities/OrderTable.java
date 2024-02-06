package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "order_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderTable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id") // Adjust the column name accordingly
    private User user;

    private String deliveryAddress;

    private LocalDateTime dateOfSubmission;

    private List<OrderLine> orderlines = new ArrayList<>();

    public OrderTable(User user, String deliveryAddress, LocalDateTime dateOfSubmission) {
        this.user = user;
        this.deliveryAddress = deliveryAddress;
        this.dateOfSubmission = dateOfSubmission;

    }}
