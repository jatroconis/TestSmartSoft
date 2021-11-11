package com.jatroconis.springboot.web.app.repositories;

import com.jatroconis.springboot.web.app.models.ProductoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel,Long> {
    
}
