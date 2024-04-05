package com.homeinventory.homeinventory.service.impl;

import com.homeinventory.homeinventory.model.Product;
import com.homeinventory.homeinventory.repository.ProductRepository;
import com.homeinventory.homeinventory.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String createProduct(Product product) {
        productRepository.save(product);
        return "Success";
    }

    @Override
    public String updateProduct(Product product) {
        productRepository.save(product);
        return "Success";
    }

    @Override
    public String deleteProduct(String productId) {
        productRepository.deleteById(productId);
        return "Success";
    }

    @Override
    public Product getProduct(String productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
