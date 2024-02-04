package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Cart {

    @Id
    private Long Id;

    @OneToMany
    private List<OrderLine> orderlines;

    public Cart(List<OrderLine> orderlines) {
        this.orderlines = orderlines;
    }
}
