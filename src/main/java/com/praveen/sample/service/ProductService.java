package com.praveen.sample.service;

import java.util.List;

import com.praveen.sample.model.Product;

public interface ProductService {

    Product saveProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    Product getProduct(String productId);
    void deleteProduct(String productId);
}
