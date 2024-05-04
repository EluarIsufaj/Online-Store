package com.example.demo.Entities;


import com.example.demo.EnumClasses.ProductType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;
    private String description;
    private String thumbnail;

    @ManyToOne
    private Category category;



    private Double price;

    @Enumerated(EnumType.STRING)
    private ProductType productType;


    @ManyToOne
    private Author author;



}
