package com.example.demo.Entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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

    @NotNull
    private String fullname;
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String City;
    @NotNull
    private String address;
    @NotNull
    private String logo;
    @NotNull
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
