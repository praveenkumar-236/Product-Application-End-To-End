package com.praveen.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.sample.dto.ProductDto;
import com.praveen.sample.model.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDto productDto;

    @Override
    public List<Product> getAllProducts() {
        return productDto.getAllProducts();
    }

    @Override
    public Product getProductById(String id) {
        return productDto.getProductById(id);
    }

    @Override
    public void insertProduct(Product product) {
        productDto.insertProduct(product);
    }

    @Override
    public void deleteProduct(String id) {
        productDto.deleteProduct(id);
    }
}
