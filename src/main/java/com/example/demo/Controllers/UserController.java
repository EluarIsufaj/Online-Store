package com.example.demo.Controllers;


import com.example.demo.Entities.Product;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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




    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Logic to process the received user entity
        System.out.println("Received user: " + user.toString());

        if(userService.emailValidator(user.getEmail())){
            userService.addUser(user);
            System.out.println("User registered successfully");
            return new ResponseEntity<String>(HttpStatus.OK);
        }else return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
    }



    @GetMapping("/login")
    public ResponseEntity<Object> login(@RequestParam String email, @RequestParam String password) {
        System.out.println("Recived user: " + email + ", " + password);
        if (userService.login(email, password)) {
            User user = userService.returnUser(email);
            return ResponseEntity.ok().body(user); // Return user entity if login is successful
        } else {
            // Check if user doesn't exist or credentials are invalid
            boolean userExists = userService.checkIfUserExists(email);
            if (!userExists) {
                // Return 404 Not Found if user doesn't exist
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
            } else {
                // Return 401 Unauthorized if credentials are invalid
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }
        }
    }




}
