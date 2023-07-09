package com.example.Ecommerce_API.controller;

import com.example.Ecommerce_API.model.Product;
import com.example.Ecommerce_API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public void createProduct(@RequestBody  Product product){
        productService.createProduct(product);
    }


    @GetMapping("products")
    public Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("product/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @DeleteMapping("product/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }

}
