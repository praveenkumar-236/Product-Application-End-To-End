package com.praveen.sample.service;

import com.praveen.sample.model.Product;

public interface ProductService {
    void insertProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(String productId);

    Product getProductById(String productId);
}
