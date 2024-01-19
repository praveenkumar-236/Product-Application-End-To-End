    package com.praveen.util;

    public class ProductCodeGen {
    
            public static String generateProductCode(String productName) {
                if (productName == null || productName.length() < 3) {
                    throw new IllegalArgumentException("Product name should have at least three characters.");
                }
        
                String firstTwoLetters = productName.substring(0, 2).toUpperCase();
                String lastLetter = productName.substring(productName.length() - 1).toUpperCase();
        
                return firstTwoLetters + lastLetter;
            }
        }
        
        

