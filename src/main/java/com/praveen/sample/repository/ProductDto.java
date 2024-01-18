package com.praveen.sample.repository;

import com.praveen.sample.model.Product;

public interface ProductDto {
    void insertProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(String productId);

    Product getProductById(String productId);
}