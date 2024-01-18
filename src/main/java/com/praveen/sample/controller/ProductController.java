package com.praveen.sample.controller;

import com.praveen.sample.model.Product;
import com.praveen.sample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Void> insertProduct(@RequestBody Product product) {
        productService.insertProduct(product);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Void> updateProduct(@PathVariable String productId, @RequestBody Product product) {
        Product existingProduct = productService.getProductById(productId);
        if (existingProduct != null) {
            productService.updateProduct(product);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String productId) {
        Product existingProduct = productService.getProductById(productId);
        if (existingProduct != null) {
            productService.deleteProduct(productId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable String productId) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
