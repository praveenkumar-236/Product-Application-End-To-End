package com.praveen.sample.service;

import com.praveen.sample.model.Product;
import com.praveen.sample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void insertProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.findById(productId).orElse(null);
    }
}
