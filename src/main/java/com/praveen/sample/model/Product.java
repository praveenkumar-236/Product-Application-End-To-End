package com.praveen.sample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
    @Id
    private String _id;
    private String name;
    private String code;
    private double price;
    private String description;
    private String imageUrl;
    private String companyName;
    private boolean inStock = false;

    /* Constructors */
    public Product(String _id, String name, String code, double price, String description, String imageUrl,
            String companyName, boolean inStock) {
        this._id = _id;
        this.name = name;
        this.code = code;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
        this.companyName = companyName;
        this.inStock = inStock;
    }

    /* Getters And Setters */
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

}
