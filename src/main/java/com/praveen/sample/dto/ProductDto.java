package com.praveen.sample.dto;

import java.util.List;

import com.praveen.sample.model.Product;

public interface ProductDto {
    List<Product> getAllProducts();
    Product getProductById(String id);
    void insertProduct(Product product);
    void deleteProduct(String id);
}
