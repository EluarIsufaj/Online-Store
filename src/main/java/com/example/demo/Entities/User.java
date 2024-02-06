package com.example.demo.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String email;
    private String password;
    private String City;
    private String address;
    private byte[] logo;
    @ManyToOne
    private Role role;

    public User(String email, String password, String city, String address, byte[] logo, Role role) {
        this.email = email;
        this.password = password;
        City = city;
        this.address = address;
        this.logo = logo;
        this.role = role;
    }
}
