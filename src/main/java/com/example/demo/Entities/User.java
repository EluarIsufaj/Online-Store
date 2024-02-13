package com.example.demo.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private String username;
    private String email;
    private String password;
    private String City;
    private String address;
    private String logo;

    private String role;

    public User(String email, String password, String city, String address, String logo, String role, String fullname, String username) {
        this.email = email;
        this.password = password;
        this.City = city;
        this.address = address;
        this.logo = logo;
        this.role = role;
        this.fullname = fullname;
        this.username = username;
    }
}
