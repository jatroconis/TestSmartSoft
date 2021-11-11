package com.jatroconis.springboot.web.app.repositories;

import com.jatroconis.springboot.web.app.models.DetalleModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends CrudRepository<DetalleModel,Long>{
    
}
