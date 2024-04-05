package com.homeinventory.homeinventory.repository;

import com.homeinventory.homeinventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
