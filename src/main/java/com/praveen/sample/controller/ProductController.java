package com.praveen.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.praveen.sample.model.Product;
import com.praveen.sample.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product) {
        productService.insertProduct(product);
        return product; 
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("getById/{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

   

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product product) {
        

        //need to implenet
            }

    @DeleteMapping("deleteById/{id}")
    public Product deleteProduct(@PathVariable String id) {
        Product deletedProduct = productService.getProductById(id); 
        productService.deleteProduct(id);
        return deletedProduct; 
    }
}
