package com.homeinventory.homeinventory.controller;

import com.homeinventory.homeinventory.model.Product;
import com.homeinventory.homeinventory.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{productId}")
    public Product getProductDetails(@PathVariable("productId") String productId) {
        return productService.getProduct(productId);
    }

    @GetMapping()
    public List<Product> getAllProductDetails() {
        return productService.getAllProducts();
    }

    @PostMapping
    public String createProductDetails(@RequestBody Product product) {
        productService.createProduct(product);
        return "Product created successfully";
    }

    @PutMapping
    public String updateProductDetails(@RequestBody Product product) {
        productService.updateProduct(product);
        return "Product updated successfully";
    }

    @DeleteMapping("{productId}")
    public String deleteProductDetails(@PathVariable("productId") String productId) {
        productService.deleteProduct(productId);
        return "Product deleted successfully";
    }
}
