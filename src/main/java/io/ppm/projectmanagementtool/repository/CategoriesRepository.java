package io.ppm.projectmanagementtool.repository;

import io.ppm.projectmanagementtool.entity.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends MongoRepository<Categories,String> {


}
