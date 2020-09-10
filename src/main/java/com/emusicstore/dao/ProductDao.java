package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by Tracy on 9/9/20.
 */
public interface ProductDao {

    void addProduct(Product product);
    Product getProductById(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);
}
