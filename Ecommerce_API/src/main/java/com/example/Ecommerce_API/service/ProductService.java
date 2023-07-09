package com.example.Ecommerce_API.service;

import com.example.Ecommerce_API.model.Product;
import com.example.Ecommerce_API.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public void createProduct(Product product) {
        productRepo.save(product);
    }

    public Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(Integer id) {
        return productRepo.findById(id);
    }

    public String deleteProductById(Integer id) {
        productRepo.deleteById(id);
        return "product deleted";
    }
}
