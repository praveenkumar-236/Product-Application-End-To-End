package com.praveen.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.praveen.sample.model.Product;
import com.praveen.sample.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create/product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getProduct/{productId}")
    public Product getProduct(@PathVariable(name = "productId") String productId) {
        return productService.getProduct(productId);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public void deleteProduct(@PathVariable(name = "productId") String productId) {
        productService.deleteProduct(productId);
    }
}
