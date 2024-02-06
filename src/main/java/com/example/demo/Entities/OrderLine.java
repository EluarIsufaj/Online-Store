package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@Entity(name = "order_line_table")
@Table(name = "order_line_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @Column(name = "number_of_products")
    private Integer numberOfProducts;

    @Column(name = "price")
    private Integer price;





}
