package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JavaType;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;
import org.hibernate.type.SqlTypes;


@Entity(name = "order_line_table")
@Table(name = "order_line_table")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity=Product.class, fetch=FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;


    @Column(name = "number_of_products")
    private Integer numberOfProducts;

    @Column(name = "price")
    private Integer price;





}
