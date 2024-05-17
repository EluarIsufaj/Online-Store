package com.example.demo.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import com.example.demo.Entities.Product;
import com.example.demo.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {



    @Autowired
    ProductRepository productRepository;


    public List<Product> getPagedProducts(int pageNo, int pageSize){
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Product> products = productRepository.findAll(pageable);
        List<Product> listOfProducts = products.getContent();
        return listOfProducts;
    }


    public void createProduct(Product product){
        productRepository.save(product);
    }


}
