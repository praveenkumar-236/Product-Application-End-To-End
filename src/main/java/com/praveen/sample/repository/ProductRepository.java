package com.praveen.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.praveen.sample.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
