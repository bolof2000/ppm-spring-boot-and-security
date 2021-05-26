package io.ppm.projectmanagementtool.controllers;

import io.ppm.projectmanagementtool.entity.Categories;
import io.ppm.projectmanagementtool.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @Autowired
    CategoriesService categoriesService;

    @PostMapping("/create")
    public Categories createCategories(@RequestBody Categories categories){
        return categoriesService.createCategories(categories);
    }


    @GetMapping("/all")
        public List<Categories> getCategories(){
        return categoriesService.getAllCategories();
    }

    @GetMapping("/getById/{id}")
    public Optional<Categories> getCategoriesById(@PathVariable String id){
        return categoriesService.getCategoriesById(id);
    }
}
