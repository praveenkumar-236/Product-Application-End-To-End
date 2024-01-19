    package com.praveen.sample.service;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.mongodb.core.MongoTemplate;
    import org.springframework.data.mongodb.core.query.Criteria;
    import org.springframework.data.mongodb.core.query.Query;
    import org.springframework.stereotype.Service;

    import com.praveen.sample.dto.ProductDto;
    import com.praveen.sample.model.Product;
    import com.praveen.util.ProductCodeGen;

    import java.util.List;

    @Service
    public class ProductServiceImpl implements ProductService {

        @Autowired
        private ProductDto productDto;

        @Autowired
        private MongoTemplate mongoTemplate;

        @Override
        public List<Product> getAllProducts() {

            Query query = new Query(Criteria.where("deleted").ne(true));
            return mongoTemplate.find(query, Product.class);
        }

        @Override
        public Product getProductById(String id) {

            Query query = new Query(Criteria.where("_id").is(id).and("deleted").ne(true));
            return mongoTemplate.findOne(query, Product.class);
        }

        @Override
        public void insertProduct(Product product) {
            String prodString = ProductCodeGen.generateProductCode(product.getName());
            product.setCode(prodString);
            productDto.insertProduct(product);
        }

        @Override
        public void deleteProduct(String id) {
            Product product = getProductById(id);
            if (product != null) {

                product.setDeleted(true);
                mongoTemplate.save(product);
            }
        }

        @Override
        public void updateProduct(String id, Product updatedProduct) {

            Product existingProduct = getProductById(id);
            if (existingProduct != null && !existingProduct.isDeleted()) {
                existingProduct.setName(updatedProduct.getName());
                existingProduct.setCode(updatedProduct.getCode());
                existingProduct.setPrice(updatedProduct.getPrice());
                existingProduct.setDescription(updatedProduct.getDescription());
                existingProduct.setImageUrl(updatedProduct.getImageUrl());
                existingProduct.setCompanyName(updatedProduct.getCompanyName());
                existingProduct.setInStock(updatedProduct.isInStock());

                productDto.insertProduct(existingProduct);
            }
        }
    }
