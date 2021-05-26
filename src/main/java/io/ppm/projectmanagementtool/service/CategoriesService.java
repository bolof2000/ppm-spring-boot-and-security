package io.ppm.projectmanagementtool.service;

import io.ppm.projectmanagementtool.entity.Categories;
import io.ppm.projectmanagementtool.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {


    @Autowired
    CategoriesRepository categoriesRepository;
    public Categories createCategories(Categories categories){

        return categoriesRepository.save(categories);
    }

    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    public Optional<Categories> getCategoriesById(String id) {

        return categoriesRepository.findById(id);
    }
}
