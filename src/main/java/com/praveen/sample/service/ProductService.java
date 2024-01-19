package com.praveen.sample.service;
import org.bson.types.ObjectId;

import com.praveen.sample.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String id);
    void insertProduct(Product product);
    void deleteProduct(String id);
    void updateProduct(String id, Product updatedProduct);
}
