package com.example.demo.Entities;


import com.example.demo.EnumClasses.ProductType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;
    private String description;
    private byte[] thumbnail;

    @ManyToOne
    private Category category;



    private Double price;

    @Enumerated(EnumType.STRING)
    private ProductType productType;


    @ManyToOne
    private Author author;



}
