package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "order_table")
@Data
@Getter
@Setter
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

    @OneToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Cart cart;

  }
