package com.example.demo.Controllers;


import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "userSignUp";
    }


    @PostMapping("/signup")
    @ResponseBody
    public String processRegistration(@ModelAttribute User user) {
        userService.addUser(user);
        return "horayy, its done!!";
    }
}
