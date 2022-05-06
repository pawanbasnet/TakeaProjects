package com.ims.dao;

import java.util.List;

import com.ims.model.Product;

public interface ProductDao {
    void addProducts();
    List <Product> viewAllProduct();
    Product viewProduct(int pno); 
    
}
