package com.example.demo.Controllers;


import com.example.demo.Entities.Product;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Service.ProductService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getPagedProducts( @RequestParam(defaultValue = "0") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        return productService.getPagedProducts(pageNo, pageSize);
    }




}
