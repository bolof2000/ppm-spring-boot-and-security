package io.ppm.projectmanagementtool.service;

import io.ppm.projectmanagementtool.entity.Products;
import io.ppm.projectmanagementtool.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    ProductRepository productRepository;

    public Products createProducts(Products products){

        return productRepository.save(products);
    }

    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Products> getProductsById(String id) {
        return productRepository.findById(id);
    }
}
