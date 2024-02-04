package com.example.demo.Entities;


import com.example.demo.EnumClasses.ProductType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;
    private String description;
    private byte[] thumbnail;

    @ManyToOne
    private Category category;



    private Float price;

    @Enumerated(EnumType.STRING)
    private ProductType productType;


    @ManyToOne
    private Author author;

    public Product(String title, String description, byte[] thumbnail, Category category, Float price, ProductType productType, Author author) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.category = category;
        this.price = price;
        this.productType = productType;
        this.author = author;
    }}
