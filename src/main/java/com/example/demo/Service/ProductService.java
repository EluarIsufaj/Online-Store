package com.example.demo.Service;

import com.example.demo.Entities.Product;
import com.example.demo.ExceptionClasess.ProductException;
import com.example.demo.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


//   public void saveProduct(Product product) throws ProductException {
//       String title = product.getTitle();
//       String AuthorName = product.getAuthor().getAuthorName();
//
//       //Product product1 = repository.findByTitleAndAuthorName(title, AuthorName);
//
//       List<Product> products = new ArrayList<>();
//       if (product1 != null) {
//           products.add(product1);
//           throw new ProductException("Produkti egziston!");
//       }else repository.save(product);
//
//   }

}
