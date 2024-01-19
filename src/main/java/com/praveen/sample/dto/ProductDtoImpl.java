package com.praveen.sample.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;
import org.springframework.data.mongodb.core.query.Query;

import com.praveen.sample.model.Product;

import java.util.List;

@Component
public class ProductDtoImpl implements ProductDto {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Product> getAllProducts() {
        return mongoTemplate.findAll(Product.class);
    }

    @Override
    public Product getProductById(String id) {
        return mongoTemplate.findById(id, Product.class);
    }

    @Override
    public void insertProduct(Product product) {
        mongoTemplate.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        mongoTemplate.remove(Query.query(Criteria.where("id").is(id)), Product.class);
    }
}
