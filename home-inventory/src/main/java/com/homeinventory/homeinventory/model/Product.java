package com.homeinventory.homeinventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_info")
public class Product {

    @Id
    String productId;
    String productName;
    double quantity;

    public Product() {
    }

    public Product(String productId, String productName, double quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
