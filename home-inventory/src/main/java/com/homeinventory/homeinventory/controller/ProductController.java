package com.homeinventory.homeinventory.controller;

import com.homeinventory.homeinventory.model.Product;
import com.homeinventory.homeinventory.response.ResponseHandler;
import com.homeinventory.homeinventory.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> getProductDetails(@PathVariable("productId") String productId) {
        return ResponseHandler.responseBuilder("Requested Product Details are given",
                HttpStatus.OK, productService.getProduct(productId));
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
