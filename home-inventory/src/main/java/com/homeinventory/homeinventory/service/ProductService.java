package com.homeinventory.homeinventory.service;

import com.homeinventory.homeinventory.model.Product;

import java.util.List;

public interface ProductService {
    public String createProduct(Product product);
    public String updateProduct(Product product);
    public String deleteProduct(String productId);
    public Product getProduct(String productId);
    public List<Product> getAllProducts();

}
