    package com.praveen.sample.service;
    import java.util.List;

    import com.praveen.sample.model.Product;

    public interface ProductService {
        List<Product> getAllProducts();
        Product getProductById(String id);
        void insertProduct(Product product);
        void deleteProduct(String id);
        void updateProduct(String id, Product updatedProduct);
    }
