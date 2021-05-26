package io.ppm.projectmanagementtool.repository;

import io.ppm.projectmanagementtool.entity.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Products,String> {
}
