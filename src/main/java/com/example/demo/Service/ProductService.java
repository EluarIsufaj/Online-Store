package com.example.demo.Service;

import com.example.demo.Entities.Product;
import com.example.demo.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Method to save a product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Method to find a product by its ID
    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    // Method to retrieve all products
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    // Method to delete a product by its ID
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    // Method to update a product
    public Product updateProduct(Long id, Product updatedProduct) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product existingProduct = optionalProduct.get();
            existingProduct.setTitle(updatedProduct.getTitle());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setThumbnail(updatedProduct.getThumbnail());
            existingProduct.setCategory(updatedProduct.getCategory());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setProductType(updatedProduct.getProductType());
            existingProduct.setAuthor(updatedProduct.getAuthor());
            return productRepository.save(existingProduct);
        } else {
            // Handle the case where the product with the given ID is not found
            return null;
        }
    }
}
