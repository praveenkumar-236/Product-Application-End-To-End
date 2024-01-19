package com.praveen.sample.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.sample.dto.ProductDto;
import com.praveen.sample.model.Product;

import org.bson.types.ObjectId;

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

    @Override
    public void updateProduct(String id, Product updatedProduct) {
        ObjectId objectId;
        try {
            objectId = new ObjectId(id);
        } catch (Exception e) {
            // Handle the exception (invalid ObjectId)
            return;
        }

        Product existingProduct = productDto.getProductById(id);
        if (existingProduct != null) {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setCode(updatedProduct.getCode());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setImageUrl(updatedProduct.getImageUrl());
            existingProduct.setCompanyName(updatedProduct.getCompanyName());
            existingProduct.setInStock(updatedProduct.isInStock());

            productDto.insertProduct(existingProduct); // Save the updated product
        }
    }
}
