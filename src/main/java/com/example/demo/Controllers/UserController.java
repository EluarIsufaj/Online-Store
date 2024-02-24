package com.example.demo.Controllers;


import com.example.demo.Entities.Product;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    UserService userService;
    @Autowired
    ProductRepository productRepository;



    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Logic to process the received user entity
        System.out.println("Received user: " + user.toString());


        userService.addUser(user);

        return ResponseEntity.ok("User created successfully");
    }
}
