package io.ppm.projectmanagementtool.controllers;

import io.ppm.projectmanagementtool.entity.Products;
import io.ppm.projectmanagementtool.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @PostMapping("/create")
    public Products createProduct(@RequestBody Products products){
        return productsService.createProducts(products);
    }

    @GetMapping("/all")
    public List<Products> getAllProducts(){
        return productsService.getAllProducts();
    }

    @GetMapping("/getById/{id}")
    public Optional<Products> getProductsById(@PathVariable String id){
        return productsService.getProductsById(id);
    }


}
