package com.example.demo.Controllers;


import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    @Autowired
    UserRepository userRepository;


}
